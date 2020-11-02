package de.cotto.playground.moduleone;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HelloTest {

    private Hello hello;

    @BeforeEach
    void setUp() {
        hello = new Hello();
    }

    @Test
    void test() {
        assertThat(hello.world()).isEqualTo("Hello World");
    }
}