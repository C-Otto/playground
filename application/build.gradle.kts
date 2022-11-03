plugins {
    id("playground.java-conventions")
    application
}

application {
    mainClass.set("de.cotto.playground.Main")
}

dependencies {
    implementation(project(":subproject-two"))
    implementation("org.slf4j:slf4j-api")
    runtimeOnly("ch.qos.logback:logback-classic")
    integrationTestImplementation("uk.org.lidalia:slf4j-test")
    configurations.named("integrationTestRuntimeOnly") {
        exclude(group = "ch.qos.logback", module = "logback-classic")
        exclude(group = "org.slf4j", module = "slf4j-nop")
    }
}
