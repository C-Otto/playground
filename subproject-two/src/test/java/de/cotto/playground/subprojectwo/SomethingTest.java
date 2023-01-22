package de.cotto.playground.subprojectwo;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.jupiter.api.Test;

class SomethingTest {
    @Test
    void testEquals() {
        EqualsVerifier.configure().suppress(Warning.NULL_FIELDS).forClass(Something.class).verify();
    }
}
