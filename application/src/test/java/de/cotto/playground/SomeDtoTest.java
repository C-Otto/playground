package de.cotto.playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomeDtoTest {
    @Test
    void content() {
        assertThat(new SomeDto("x").content()).isEqualTo("x");
    }
}
