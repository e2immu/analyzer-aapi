package org.e2immu.analyzer.aapi.parser;

import ch.qos.logback.classic.Level;
import org.e2immu.language.cst.api.analysis.Message;
import org.e2immu.language.inspection.integration.ToolChain;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class TestRun {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRun.class);

    private static final String[] SOURCES = new String[]{"../e2immu-aapi-archive/src/main/java/org/e2immu/analyzer/aapi/archive"};

    @Test
    public void test() throws IOException {
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME)).setLevel(Level.INFO);
        ((ch.qos.logback.classic.Logger) LoggerFactory.getLogger("org.e2immu.analyzer.aapi")).setLevel(Level.DEBUG);

        for (ToolChain.JRE jre : ToolChain.JRES) {
            if ("Homebrew".equals(jre.vendor()) && 17 <= jre.mainVersion()) {
                Run run = new Run();
                List<Message> messages = run.go(jre.path(), SOURCES);
                LOGGER.info("Have {} message(s)", messages.size());
                messages.forEach(m -> {
                    LOGGER.info("{} {}: {}", m.level(), m.info(), m.message());
                });
            }
        }
    }
}
