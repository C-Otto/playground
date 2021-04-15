package de.cotto.playground.subprojectone.nested;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ExampleTest {
    @Test
    void foo() {
        assertThat(new Example()).isInstanceOf(Example.class);
    }
}