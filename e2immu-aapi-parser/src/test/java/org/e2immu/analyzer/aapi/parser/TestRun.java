package org.e2immu.analyzer.aapi.parser;

import ch.qos.logback.classic.Level;
import org.e2immu.analyzer.modification.common.defaults.ShallowAnalyzer;
import org.e2immu.analyzer.modification.prepwork.PrepAnalyzer;
import org.e2immu.language.cst.api.analysis.Message;
import org.e2immu.language.cst.api.element.Element;
import org.e2immu.language.cst.api.info.Info;
import org.e2immu.language.cst.api.info.MethodInfo;
import org.e2immu.language.cst.api.info.TypeInfo;
import org.e2immu.language.cst.impl.analysis.PropertyImpl;
import org.e2immu.language.cst.impl.analysis.ValueImpl;
import org.e2immu.language.inspection.integration.JavaInspectorImpl;
import org.e2immu.language.inspection.integration.ToolChain;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class TestRun {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRun.class);

    @Test
    public void test() throws IOException {
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME)).setLevel(Level.INFO);
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger("org.e2immu.analyzer.aapi")).setLevel(Level.DEBUG);

        Run run = new Run();
        List<Message> messages = run.go();
        LOGGER.info("Have {} message(s)", messages.size());
        messages.forEach(m -> {
            LOGGER.info("{} {}: {}", m.level(), m.info(), m.message());
        });
    }

    @Test
    public void testJavaxSwing21() throws IOException {
        AnnotatedApiParser annotatedApiParser = new AnnotatedApiParser();
        List<String> classPath = new ArrayList<>();
        Collections.addAll(classPath, ToolChain.CLASSPATH_JUNIT);
        Collections.addAll(classPath, ToolChain.CLASSPATH_SLF4J_LOGBACK);
        classPath.add(JavaInspectorImpl.E2IMMU_SUPPORT);
        annotatedApiParser.initialize(ToolChain.currentJre().path(),
                classPath,
                List.of(Run.AAPI_DIR),
                List.of("jdk"));
        ShallowAnalyzer shallowAnalyzer = new ShallowAnalyzer(annotatedApiParser.runtime(), annotatedApiParser,
                true);
        assertEquals(216, annotatedApiParser.types().size());
        TypeInfo abstractButton = annotatedApiParser.types().stream()
                .filter(ti -> "javax.swing.AbstractButton".equals(ti.fullyQualifiedName())).findFirst().orElseThrow();
        TypeInfo accessibleAB = abstractButton.findSubType("AccessibleAbstractButton");

        shallowAnalyzer.go(annotatedApiParser.types());
        assertTrue(accessibleAB.analysis().haveAnalyzedValueFor(PropertyImpl.DEFAULTS_ANALYZER));
        for (MethodInfo constructor : accessibleAB.constructors()) {
            assertFalse(constructor.analysis().haveAnalyzedValueFor(PropertyImpl.DEFAULTS_ANALYZER));
        }
    }
}
