package org.e2immu.analyzer.aapi.parser;

import ch.qos.logback.classic.Level;
import org.e2immu.analyzer.modification.common.defaults.DebugVisitor;
import org.e2immu.language.cst.api.analysis.Message;
import org.e2immu.language.cst.api.info.TypeInfo;
import org.e2immu.language.inspection.integration.ToolChain;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRun {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRun.class);

    @BeforeAll
    public static void beforeAll() {
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME)).setLevel(Level.INFO);
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger("org.e2immu.analyzer.aapi")).setLevel(Level.DEBUG);
    }

    @Test
    public void test() throws IOException {
        Run run = new Run(new RunVisitor() {
            private String libIn;
            private String libOut;
            private ToolChain.JRE jre;

            @Override
            public void setContext(String libIn, String libOut, ToolChain.JRE jre) {
                this.libIn = libIn;
                this.libOut = libOut;
                this.jre = jre;
            }

            private String context() {
                return libIn + "-" + jre.shortName();
            }

            @Override
            public DebugVisitor debugVisitor() {
                return new DebugVisitor() {
                    @Override
                    public void inputTypes(List<TypeInfo> allTypes) {
                        int expect = switch (context()) {
                            case "jdk-Homebrew-24.0.1", "jdk-Homebrew-21.0.7" -> 216;
                            case "libs.e2immu-Homebrew-24.0.1" -> 0;
                            case "libs.log-Homebrew-24.0.1" -> 3;
                            case "libs.test-Homebrew-24.0.1" -> 4;
                            default -> -1;
                        };
                        assertEquals(expect, allTypes.size(), context());
                    }

                    @Override
                    public void allTypes(List<TypeInfo> allTypes) {
                        int expect = switch (context()) {
                            case "jdk-Homebrew-21.0.7" -> 277;// 235;
                            case "jdk-Homebrew-24.0.1" -> 277;// 237;//277;// 235;
                            case "libs.e2immu-Homebrew-24.0.1" -> 0;
                            case "libs.log-Homebrew-24.0.1" -> 4;
                            case "libs.test-Homebrew-24.0.1" -> 5;
                            default -> -1;
                        };
                        assertEquals(expect, allTypes.size(), context());
                    }
                };
            }
        });
        List<Message> messages = run.go();
        LOGGER.info("Have {} message(s)", messages.size());
        messages.forEach(m -> {
            LOGGER.info("{} {}: {}", m.level(), m.info(), m.message());
        });
    }
}
