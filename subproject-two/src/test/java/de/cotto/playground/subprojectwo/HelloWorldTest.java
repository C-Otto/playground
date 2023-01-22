package de.cotto.playground.subprojectwo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HelloWorldTest {
    @Test
    void test() {
        assertThat(new HelloWorld().helloWorld()).isEqualTo("Hello World!");
    }
}
