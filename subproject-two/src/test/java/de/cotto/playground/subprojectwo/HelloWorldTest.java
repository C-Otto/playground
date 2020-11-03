package de.cotto.playground.subprojectwo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class HelloWorldTest {
    @Test
    void test() {
        assertThat(new HelloWorld().helloWorld()).isEqualTo("Hello World!");
    }
}