package de.cotto.playground.subprojectone;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.Test;

class HelloIT {
    @Test
    void test() {
        assertThat(new Hello().world()).isEqualTo("Hello World");
    }
}