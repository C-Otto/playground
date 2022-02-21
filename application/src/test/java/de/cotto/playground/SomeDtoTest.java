package de.cotto.playground;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SomeDtoTest {
    @Test
    void content() {
        assertThat(new SomeDto("x").content()).isEqualTo("x");
    }
}