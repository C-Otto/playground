import com.github.spotbugs.snom.SpotBugsTask

plugins {
    id("com.github.spotbugs")
}

tasks.withType<SpotBugsTask>().configureEach {
    reports.create("xml") {
        enabled = false
    }
    reports.create("html") {
        enabled = true
    }
}
spotbugs {
    excludeFilter.set(file("${rootDir}/config/spotbugs-exclude.xml"))
}
