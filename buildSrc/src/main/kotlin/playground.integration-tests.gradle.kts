plugins {
    id("playground.tests")
}

testing {
    suites {
        this.register("integrationTest", JvmTestSuite::class) {
            dependencies {
                implementation(project.dependencies.platform("de.cotto.playground:platform"))
                implementation(project())
            }

            targets {
                configureEach {
                    testTask.configure {
                        shouldRunAfter(testing.suites.named("test"))
                    }
                }
            }
        }

        getting(JvmTestSuite::class) {
            useJUnitJupiter()

            dependencies {
                implementation("org.assertj:assertj-core")
            }
        }
    }
}

tasks.named("check") {
    dependsOn(testing.suites.named("integrationTest"))
}

testing.suites.named("integrationTest") {
    testlogger {
        slowThreshold = 2000
    }
}
