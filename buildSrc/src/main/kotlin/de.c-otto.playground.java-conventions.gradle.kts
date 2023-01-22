plugins {
    java
    id("de.c-otto.playground.architecture-tests")
}

// https://github.com/gradle/gradle/issues/22468
apply(plugin = "de.c-otto.java-conventions")

group = "de.c-otto.playground"

tasks.named("check") {
    dependsOn("pitest")
}
