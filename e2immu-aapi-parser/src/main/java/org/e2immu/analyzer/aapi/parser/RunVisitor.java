package org.e2immu.analyzer.aapi.parser;

import org.e2immu.analyzer.modification.common.defaults.DebugVisitor;
import org.e2immu.language.inspection.integration.ToolChain;

public interface RunVisitor {

    default void setContext(String libIn, String libOut, ToolChain.JRE jre) {}

    default DebugVisitor debugVisitor() { return null; }
}
