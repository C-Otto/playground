package de.cotto;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

class SomethingTest {
    @Test
    void constructor() {
        assertThatCode(() -> new Something("x", 5)).doesNotThrowAnyException();
    }

    @Test
    void testEquals() {
        EqualsVerifier.configure().suppress(Warning.NULL_FIELDS).forClass(Something.class).verify();
    }
}