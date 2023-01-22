plugins {
    id("de.c-otto.java-conventions")
}

dependencies {
    testImplementation("com.tngtech.archunit:archunit")
}

val exposedTestClasses: Configuration by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
}
val exposedTestRuntimeClasspath: Configuration by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
}

artifacts {
    sourceSets.named("test") {
        output.classesDirs.files.forEach {
            add("exposedTestClasses", it) {
                builtBy(tasks.named("compileTestJava"))
            }
        }
    }
    sourceSets.named("test") {
        runtimeClasspath.files.forEach {
            add("exposedTestRuntimeClasspath", it) {
            }
        }
    }
}


tasks.jacocoTestCoverageVerification {
    enabled = false
}
