package de.cotto.playground.subprojectone;

import java.util.List;

public class TestableInputOutputDtoDeserializer extends DefaultInputOutputDtoDeserializer {
    public TestableInputOutputDtoDeserializer() {
        super(
                List.of("i", "n", "puts"),
                List.of("outputs-are-nested-here", "*"),
                "value",
                "weird-value",
                "address"
        );
    }
}
