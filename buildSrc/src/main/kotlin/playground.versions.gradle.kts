import com.github.spotbugs.snom.SpotBugsExtension
import de.aaschmid.gradle.plugins.cpd.CpdExtension
import info.solidsoft.gradle.pitest.PitestPluginExtension
import org.gradle.api.plugins.quality.CheckstyleExtension
import org.gradle.api.plugins.quality.PmdExtension
import org.gradle.testing.jacoco.plugins.JacocoPluginExtension

configure<CheckstyleExtension> {
    toolVersion = "latest.release"
}

configure<SpotBugsExtension> {
    toolVersion.set("4.7.3")
}

configure<PmdExtension> {
    toolVersion = "6.52.0"
}

configure<CpdExtension> {
    toolVersion = "6.52.0"
}

configure<PitestPluginExtension> {
    pitestVersion.set("latest.release")
    junit5PluginVersion.set("latest.release")
}

configure<JacocoPluginExtension> {
    toolVersion = "latest.release"
}
