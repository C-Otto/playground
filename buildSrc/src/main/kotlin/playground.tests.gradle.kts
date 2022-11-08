import com.adarshr.gradle.testlogger.theme.ThemeType

plugins {
    java
    id("com.adarshr.test-logger")
}

testing {
    suites {
        withType<JvmTestSuite>().configureEach {
            useJUnitJupiter()
            dependencies {
                implementation("org.assertj:assertj-core")
                implementation("nl.jqno.equalsverifier:equalsverifier")
                implementation("org.slf4j:slf4j-nop")
            }
        }
    }
}


tasks.withType<Test>().configureEach {
    afterTest(KotlinClosure2<TestDescriptor, TestResult, Unit>({ _, result ->
        if (result.resultType == TestResult.ResultType.SKIPPED) {
            throw GradleException("Do not ignore test cases")
        }
    }))
    systemProperties = mapOf("junit.jupiter.displayname.generator.default" to "org.junit.jupiter.api.DisplayNameGenerator\$ReplaceUnderscores")
}

testlogger {
    theme = ThemeType.STANDARD_PARALLEL
    slowThreshold = 1000
    showSimpleNames = true
    showOnlySlow = true
}
