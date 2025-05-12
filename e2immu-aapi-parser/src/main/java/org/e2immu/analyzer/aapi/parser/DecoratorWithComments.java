package org.e2immu.analyzer.aapi.parser;


import org.e2immu.analyzer.modification.io.DecoratorImpl;
import org.e2immu.language.cst.api.element.Comment;
import org.e2immu.language.cst.api.info.Info;
import org.e2immu.language.cst.api.info.MethodInfo;
import org.e2immu.language.cst.api.runtime.Runtime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

class DecoratorWithComments extends DecoratorImpl {
    private static final Logger LOGGER = LoggerFactory.getLogger(DecoratorWithComments.class);

    private final org.e2immu.language.cst.api.runtime.Runtime runtime;
    private final Map<Info, Info> translationMap;
    private final Function<Info, AnnotatedApiParser.Data> dataProvider;

    public DecoratorWithComments(Runtime runtime,
                                 Map<Info, Info> translationMap,
                                 Function<Info, AnnotatedApiParser.Data> dataProvider) {
        super(runtime, translationMap);
        this.translationMap = translationMap;
        this.runtime = runtime;
        this.dataProvider = dataProvider;
    }

    @Override
    public List<Comment> comments(Info infoIn) {
        Info info = translationMap == null ? infoIn : translationMap.getOrDefault(infoIn, infoIn);
        List<Comment> comments = super.comments(info);
        if (info instanceof MethodInfo mi) {
            AnnotatedApiParser.Data data = dataProvider.apply(mi);
            Integer frequency = data != null ? data.frequency() : null;
            Comment comment;
            if (frequency != null) {
                comment = runtime.newSingleLineComment("frequency " + frequency);
            } else {
                Integer overrideFrequency = data != null ? data.overrideHasFrequency() : null;
                if (overrideFrequency != null) {
                    comment = runtime.newSingleLineComment("override has frequency " + overrideFrequency);
                    return Stream.concat(Stream.of(comment), comments.stream()).toList();
                } else {
                    comment = null;
                }
            }
            if (comment != null) LOGGER.debug("Annotating " + mi + " with " + comment.comment());
            return Stream.concat(Stream.ofNullable(comment), comments.stream()).toList();
        }
        return comments;
    }
}
