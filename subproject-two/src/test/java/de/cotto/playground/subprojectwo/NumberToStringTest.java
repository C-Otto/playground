package de.cotto.playground.subprojectwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberToStringTest {
    private NumberToString numberToString;

    @BeforeEach
    void setUp() {
        numberToString = new NumberToString();
    }

    @Test
    void testDoSomething() {
        String converted = numberToString.toString(1);
        assertThat(converted).isEqualTo("1");
    }
}
