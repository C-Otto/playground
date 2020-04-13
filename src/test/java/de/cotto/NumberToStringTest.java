package de.cotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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