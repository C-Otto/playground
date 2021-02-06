package de.cotto.playground;

import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.lidalia.slf4jtest.LoggingEvent.info;

import org.junit.jupiter.api.Test;
import uk.org.lidalia.slf4jtest.TestLogger;
import uk.org.lidalia.slf4jtest.TestLoggerFactory;

class MainIT {
    private final TestLogger logger = TestLoggerFactory.getTestLogger(Main.class);

    @Test
    void result_is_logged() {
        Main.main(new String[]{});
        assertThat(logger.getLoggingEvents())
                .contains(info("Result: {}", "Hello World!"));
    }
}