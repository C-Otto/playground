plugins {
    id ("de.c-otto.playground.java-conventions")
}

dependencies {
    implementation(project(":subproject-one"))
}

tasks.jacocoTestCoverageVerification {
    violationRules {
        rules.forEach {rule ->
            rule.limits.forEach {limit ->
                if (limit.counter == "INSTRUCTION") {
                    limit.minimum = 0.86.toBigDecimal()
                }
                if (limit.counter == "METHOD") {
                    limit.minimum = 0.85.toBigDecimal()
                }
            }
        }
    }
}
