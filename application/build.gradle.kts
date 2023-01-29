plugins {
    id("de.c-otto.playground.java-conventions")
    application
}

application {
    mainClass.set("de.cotto.playground.Main")
}

dependencies {
    implementation(project(":subproject-two"))
    implementation(libs.slf4jApi)
    runtimeOnly("ch.qos.logback:logback-classic")
    integrationTestImplementation(libs.testing.slf4jTest)
    configurations.named("integrationTestRuntimeOnly") {
        exclude(group = "ch.qos.logback", module = "logback-classic")
        exclude(group = "org.slf4j", module = "slf4j-nop")
    }
}
