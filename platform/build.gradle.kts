plugins {
    `java-platform`
}

group = "de.cotto.playground"

dependencies {
    constraints {
        api("ch.qos.logback:logback-classic:1.2.10")
        api("com.adarshr:gradle-test-logger-plugin:3.2.0")
        api("com.github.spotbugs.snom:spotbugs-gradle-plugin:5.0.13")
        api("com.google.errorprone:error_prone_core:latest.release")
        api("com.tngtech.archunit:archunit:1.0.1")
        api("com.uber.nullaway:nullaway:latest.release")
        api("de.aaschmid:gradle-cpd-plugin:3.3")
        api("info.solidsoft.gradle.pitest:gradle-pitest-plugin:1.9.0")
        api("net.ltgt.gradle:gradle-errorprone-plugin:3.0.1")
        api("net.ltgt.gradle:gradle-nullaway-plugin:1.5.0")
        api("nl.jqno.equalsverifier:equalsverifier:latest.release")
        api("org.assertj:assertj-core:latest.release")
        api("org.slf4j:slf4j-api:2.0.3")
        api("org.slf4j:slf4j-nop:2.0.3")
        api("com.github.valfirst:slf4j-test:2.6.1")
    }
}
