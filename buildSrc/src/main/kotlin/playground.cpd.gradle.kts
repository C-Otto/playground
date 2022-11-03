plugins {
    id("de.aaschmid.cpd")
}
tasks.named("check") {
    dependsOn(tasks.named("cpdCheck"))
}
