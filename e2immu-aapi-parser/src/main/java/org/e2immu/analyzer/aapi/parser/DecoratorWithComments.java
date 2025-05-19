package org.e2immu.analyzer.aapi.parser;


import org.e2immu.analyzer.modification.common.defaults.ShallowAnalyzer;
import org.e2immu.analyzer.modification.io.DecoratorImpl;
import org.e2immu.language.cst.api.analysis.Property;
import org.e2immu.language.cst.api.element.Comment;
import org.e2immu.language.cst.api.expression.AnnotationExpression;
import org.e2immu.language.cst.api.info.Info;
import org.e2immu.language.cst.api.info.MethodInfo;
import org.e2immu.language.cst.api.info.ParameterInfo;
import org.e2immu.language.cst.api.output.Qualification;
import org.e2immu.language.cst.api.runtime.Runtime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

class DecoratorWithComments extends DecoratorImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(DecoratorWithComments.class);

    private final org.e2immu.language.cst.api.runtime.Runtime runtime;
    private final Map<Info, Info> translationMap;
    private final Function<Info, AnnotatedApiParser.Data> dataProvider;
    private final Function<Info, ShallowAnalyzer.InfoData> infoDataProvider;
    private final Qualification simpleNames;

    public DecoratorWithComments(Runtime runtime,
                                 Map<Info, Info> translationMap,
                                 Function<Info, ShallowAnalyzer.InfoData> infoDataProvider,
                                 Function<Info, AnnotatedApiParser.Data> dataProvider) {
        super(runtime, translationMap);
        this.translationMap = translationMap;
        this.runtime = runtime;
        this.dataProvider = dataProvider;
        this.infoDataProvider = infoDataProvider;
        simpleNames = runtime.qualificationSimpleNames();
    }

    @Override
    public List<AnnotationExpression> annotations(Info infoIn) {
        return annotationAndProperties(infoIn).stream()
                .filter(ap -> acceptAnnotation(ap.property(), infoIn))
                .map(AnnotationProperty::annotationExpression)
                .toList();
    }

    private boolean acceptAnnotation(Property property, Info infoIn) {
        Info translatedInfo = translationMap == null ? infoIn : translationMap.getOrDefault(infoIn, infoIn);
        ShallowAnalyzer.InfoData infoData = infoDataProvider.apply(translatedInfo);
        if (infoData == null) return true;
        ShallowAnalyzer.AnnotationOrigin ao = infoData.origin(property);
        return ao == ShallowAnalyzer.AnnotationOrigin.ANNOTATED;
    }

    private Stream<Comment> annotationsInComments(Info translatedInfo) {
        ShallowAnalyzer.InfoData infoData = infoDataProvider.apply(translatedInfo);
        if (infoData == null) return Stream.of();
        AnnotatedApiParser.Data data = dataProvider.apply(translatedInfo);
        boolean explain = data != null && data.explainAnnotationInComment();
        List<String> commentParts = new ArrayList<>();
        for (AnnotationProperty ap : annotationAndProperties(translatedInfo)) {
            ShallowAnalyzer.AnnotationOrigin origin = infoData.origin(ap.property());
            if (origin != ShallowAnalyzer.AnnotationOrigin.ANNOTATED &&
                (explain || origin != ShallowAnalyzer.AnnotationOrigin.DEFAULT)) {
                commentParts.add(ap.annotationExpression().print(simpleNames) + originSuffix(origin));
            }
        }
        if (commentParts.isEmpty()) return Stream.of();
        String comment = String.join(" ", commentParts);
        if (translatedInfo instanceof ParameterInfo) {
            return Stream.of(runtime.newMultilineComment(comment));
        }
        return Stream.of(runtime.newSingleLineComment(comment));
    }

    private static String originSuffix(ShallowAnalyzer.AnnotationOrigin origin) {
        char code = switch (origin) {
            case ANNOTATED -> 'A';
            case FROM_FIELD -> 'F';
            case FROM_METHOD -> 'M';
            case FROM_OWNER -> 'O';
            case FROM_OVERRIDE -> 'H';
            case FROM_TYPE -> 'T';
            default -> throw new UnsupportedOperationException();
        };
        return "[" + code + "]";
    }

    @Override
    public List<Comment> comments(Info infoIn) {
        Info translatedInfo = translationMap == null ? infoIn : translationMap.getOrDefault(infoIn, infoIn);
        AnnotatedApiParser.Data data = dataProvider.apply(translatedInfo);
        List<Comment> comments = data == null ? List.of() : data.comments();
        Stream<Comment> annotationStream = annotationsInComments(translatedInfo);
        if (translatedInfo instanceof MethodInfo mi) {
            Integer frequency = data != null ? data.frequency() : null;
            Comment comment;
            if (frequency != null) {
                comment = runtime.newSingleLineComment("frequency " + frequency);
            } else {
                Integer overrideFrequency = data != null ? data.overrideHasFrequency() : null;
                if (overrideFrequency != null) {
                    comment = runtime.newSingleLineComment("override has frequency " + overrideFrequency);
                } else {
                    comment = null;
                }
            }
            return Stream.concat(comments.stream(), Stream.concat(Stream.ofNullable(comment), annotationStream)).toList();
        }
        return Stream.concat(comments.stream(), annotationStream).toList();
    }

    @Override
    protected boolean isAnnotated(Info info, Property property) {
        ShallowAnalyzer.InfoData id = infoDataProvider.apply(info);
        ShallowAnalyzer.AnnotationOrigin origin = id.originMap().get(property);
        return origin == ShallowAnalyzer.AnnotationOrigin.ANNOTATED;
    }
}
