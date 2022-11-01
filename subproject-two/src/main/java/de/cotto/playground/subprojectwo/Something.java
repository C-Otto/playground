package de.cotto.playground.subprojectwo;

import java.util.Objects;

public final class Something {
    private final String fieldA;
    private final int fieldB;

    public Something(String fieldA, int fieldB) {
        this.fieldA = fieldA;
        this.fieldB = fieldB;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Something something)) {
            return false;
        }
        return fieldB == something.fieldB && fieldA.equals(something.fieldA);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fieldA, fieldB);
    }
}
