import info.solidsoft.gradle.pitest.PitestTask

plugins {
    id("playground.tests")
    id("info.solidsoft.pitest")
}

pitest {
    targetClasses.set(listOf("de.cotto.*"))
    outputFormats.set(listOf("XML", "HTML"))
    timestampedReports.set(false)
    failWhenNoMutations.set(false)
    excludedMethods.set(listOf("hashCode"))
    threads.set(Math.max(Runtime.getRuntime().availableProcessors() / 2, 1))
    testStrengthThreshold.set(100)
}

tasks.withType<PitestTask>().configureEach {
    dependsOn(tasks.named("test"))
}

tasks.named("check").configure {
    dependsOn(tasks.named("pitest"))
}
