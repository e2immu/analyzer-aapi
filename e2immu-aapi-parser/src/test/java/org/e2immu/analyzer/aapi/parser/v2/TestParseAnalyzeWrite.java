package org.e2immu.analyzer.aapi.parser.v2;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.e2immu.analyzer.aapi.parser.AnnotatedAPIConfigurationImpl;
import org.e2immu.analyzer.aapi.parser.AnnotatedApiParser;
import org.e2immu.analyzer.aapi.parser.WriteDecoratedAAPI;
import org.e2immu.analyzer.modification.common.defaults.ShallowAnalyzer;
import org.e2immu.language.cst.api.info.TypeInfo;
import org.e2immu.language.inspection.integration.JavaInspectorImpl;
import org.e2immu.language.inspection.integration.ToolChain;
import org.e2immu.language.inspection.resource.InputConfigurationImpl;
import org.e2immu.util.internal.util.Trie;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestParseAnalyzeWrite {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TestParseAnalyzeWrite.class);

    @BeforeAll
    public static void beforeAll() {
        ((Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME)).setLevel(Level.INFO);
    }

    @Test
    public void test() throws IOException {
        AnnotatedApiParser annotatedApiParser = new AnnotatedApiParser();
        annotatedApiParser.initialize(new InputConfigurationImpl.Builder()
                        .addClassPath(InputConfigurationImpl.GRADLE_DEFAULT)
                        .addClassPath(ToolChain.CLASSPATH_SLF4J_LOGBACK)
                        .addClassPath(JavaInspectorImpl.E2IMMU_SUPPORT)
                        .addSources("../e2immu-aapi-archive/src/main/java")
                        .addRestrictSourceToPackages("org.e2immu.analyzer.aapi.archive.v2").build(),
                new AnnotatedAPIConfigurationImpl.Builder().build());

        List<TypeInfo> types = annotatedApiParser.typesParsed();
        assertEquals(2, types.size());
        TypeInfo t1 = types.getFirst();
        assertEquals("org.e2immu.analyzer.aapi.archive.v2.JavaLang", t1.fullyQualifiedName());
        String uri = t1.compilationUnitOrEnclosingType().getLeft().uri().toString();
        assertTrue(uri.endsWith("aapi/archive/v2/JavaLang.java"), "Have: " + uri);

        ShallowAnalyzer shallowAnalyzer = new ShallowAnalyzer(annotatedApiParser.runtime(), annotatedApiParser);
        ShallowAnalyzer.Result rs = shallowAnalyzer.go(annotatedApiParser.types());


        Trie<TypeInfo> trie = new Trie<>();
        for (TypeInfo ti : annotatedApiParser.types()) {
            if (ti.isPrimaryType()) {
                trie.add(ti.packageName().split("\\."), ti);
            }
        }

        File decorated = new File("build/decorated");
        decorated.mkdirs();
        WriteDecoratedAAPI writeDecoratedAAPI = new WriteDecoratedAAPI(annotatedApiParser.javaInspector(),
                annotatedApiParser::data, rs.dataMap()::get);
        writeDecoratedAAPI.write(decorated.getAbsolutePath(), trie);

    }
}
