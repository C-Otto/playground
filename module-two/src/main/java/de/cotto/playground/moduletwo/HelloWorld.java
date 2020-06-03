package de.cotto.playground.moduletwo;

import de.cotto.playground.moduleone.Hello;

public class HelloWorld {
    HelloWorld() {
        // default constructor
    }

    public String helloWorld() {
        return new Hello().world() + "!";
    }
}
