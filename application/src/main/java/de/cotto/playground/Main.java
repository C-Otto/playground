package de.cotto.playground;

import de.cotto.playground.subprojectwo.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    private Main() {
        // utility class
    }

    public static void main(String[] args) {
        String result = new HelloWorld().helloWorld();
        LOGGER.info("Result: {}", result);
    }
}