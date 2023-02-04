plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

val conventionsVersion = "2023.02.04"

dependencies {
    implementation("de.c-otto:java-conventions:$conventionsVersion")
}
