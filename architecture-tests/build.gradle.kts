plugins {
    id("playground.tests")
}

dependencies {
    testImplementation("com.tngtech.archunit:archunit")
    testImplementation(project.dependencies.platform("de.cotto.playground:platform"))
}

val exposedTestClasses by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
}
val exposedTestRuntimeClasspath by configurations.creating {
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
