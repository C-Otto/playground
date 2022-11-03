import gradle.kotlin.dsl.accessors._103b2f94a208fc940edf8ed0839818a0.testing

plugins {
    id("de.aaschmid.cpd")
}
tasks.named("check") {
    dependsOn(tasks.named("cpdCheck"))
}
