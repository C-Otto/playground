plugins {
    id("de.c-otto.java-conventions")
    id("de.c-otto.playground.architecture-tests")
}

group = "de.c-otto.playground"

tasks.named("check") {
    dependsOn("pitest")
}
