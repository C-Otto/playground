package de.cotto.playground.subprojectone;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HelloIT {
    @Test
    void test() {
        assertThat(new Hello().world()).isEqualTo("Hello World");
    }
}
