package de.cotto.playground.subprojectone;

import java.util.ArrayList;
import java.util.Collection;

public class Hello {
    public Hello() {
        // default constructor
    }

    public String world() {
        return "Hello World";
    }

    public Collection<Car> checkCollection() {
        Collection<Car> cars = new ArrayList<>();
        for(int i = 0; i < 3; ++i) {
            cars.add(new Car());
        }
        return cars;
    }

    private static class Car {
    }
}
