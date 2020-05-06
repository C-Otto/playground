package de.cotto.playground.moduleone;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class HelloTest {
    @Test
    void test() {
        assertThat(new Hello().world()).isEqualTo("Hello World");
    }
}