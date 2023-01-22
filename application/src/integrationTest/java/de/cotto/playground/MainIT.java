package de.cotto.playground;

import com.github.valfirst.slf4jtest.TestLogger;
import com.github.valfirst.slf4jtest.TestLoggerFactory;
import org.junit.jupiter.api.Test;

import static com.github.valfirst.slf4jtest.LoggingEvent.info;
import static org.assertj.core.api.Assertions.assertThat;

class MainIT {
    private final TestLogger logger = TestLoggerFactory.getTestLogger(Main.class);

    @Test
    void result_is_logged() {
        Main.main(new String[]{});
        assertThat(logger.getLoggingEvents())
                .contains(info("Result: {}", "Hello World!"));
    }
}
