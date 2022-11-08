plugins {
    pmd
}

pmd {
    ruleSetFiles = files("${rootDir}/config/pmd-ruleset.xml")
    ruleSets = listOf()
    isConsoleOutput = true
}

tasks.withType<Test>{
    shouldRunAfter(tasks.withType<Pmd>())
}
