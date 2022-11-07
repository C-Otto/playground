plugins {
    java
    id("playground.tests")
    id("playground.integration-tests")
    id("playground.architecture-tests")
    id("playground.pmd")
    id("playground.jacoco")
    id("playground.errorprone")
    id("playground.cpd")
    id("playground.checkstyle")
    id("playground.mutation-tests")
    id("playground.spotbugs")
    id("playground.versions")
}

group = "de.cotto.playground"

dependencies {
    implementation(platform("de.cotto.playground:platform"))
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    consistentResolution {
        useCompileClasspathVersions()
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.compilerArgs.add("-Werror")
}