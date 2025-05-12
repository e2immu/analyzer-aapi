package org.e2immu.analyzer.aapi.parser.archive;

import org.e2immu.analyzer.aapi.parser.CommonTest;
import org.e2immu.language.cst.api.info.MethodInfo;
import org.e2immu.language.cst.api.info.ParameterInfo;
import org.e2immu.language.cst.api.info.TypeInfo;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.*;

public class TestJavaNioFile extends CommonTest {

    @Test
    public void testFilesWalkFileTree() {
        TypeInfo typeInfo = compiledTypesManager().get(Files.class);
        MethodInfo methodInfo = typeInfo.findUniqueMethod("walkFileTree", 4);
        assertTrue(methodInfo.allowsInterrupts());
        assertFalse(methodInfo.isModifying());
        ParameterInfo p3 = methodInfo.parameters().get(3);
        assertEquals("Type java.nio.file.FileVisitor<? super java.nio.file.Path>",
                p3.parameterizedType().toString());
        assertTrue(p3.isIgnoreModifications());
    }

    @Test
    public void testFilesCreateFile() {
        TypeInfo typeInfo = compiledTypesManager().get(Files.class);
        MethodInfo methodInfo = typeInfo.findUniqueMethod("createFile", 2);
        assertTrue(methodInfo.allowsInterrupts());
        assertTrue(methodInfo.isModifying());
    }

    @Test
    public void testFilesExists() {
        TypeInfo typeInfo = compiledTypesManager().get(Files.class);
        MethodInfo methodInfo = typeInfo.findUniqueMethod("exists", 2);
        assertTrue(methodInfo.allowsInterrupts());
        assertFalse(methodInfo.isModifying());
    }

}
