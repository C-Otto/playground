plugins {
    jacoco
}
tasks.named("check") {
    dependsOn(tasks.named("jacocoTestCoverageVerification"))
}

tasks.withType<Test>().configureEach {
    tasks.getByName("jacocoTestCoverageVerification").dependsOn(this)
    tasks.getByName("jacocoTestReport").mustRunAfter(this)
}

tasks.withType<JacocoCoverageVerification>().configureEach {
    getExecutionData().setFrom(fileTree(buildDir).include("/jacoco/*.exec"))

    violationRules {
        rule {
            limit {
                counter = "BRANCH"
                value = "COVEREDRATIO"
                minimum = 0.9.toBigDecimal()
            }
        }
        rule {
            limit {
                counter = "CLASS"
                value = "COVEREDRATIO"
                minimum = 1.0.toBigDecimal()
            }
        }
        rule {
            limit {
                counter = "INSTRUCTION"
                value = "COVEREDRATIO"
                minimum = 0.86.toBigDecimal()
            }
        }
        rule {
            limit {
                counter = "METHOD"
                value = "COVEREDRATIO"
                minimum = 0.8.toBigDecimal()
            }
        }
    }
}
