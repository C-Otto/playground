package de.cotto.playground.subprojectone.nested;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExampleTest {
    @Test
    void foo() {
        assertThat(new Example()).isInstanceOf(Example.class);
    }
}
