package de.cotto.playground.subprojectone;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
