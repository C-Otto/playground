package de.cotto.playground.subprojectwo;

import de.cotto.playground.subprojectone.Hello;

public class HelloWorld {
    HelloWorld() {
        // default constructor
    }

    public String helloWorld() {
        return new Hello().world() + "!";
    }
}
