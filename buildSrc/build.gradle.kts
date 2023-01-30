plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

val conventionsVersion = "2023.01.30"

dependencies {
    implementation("de.c-otto:java-conventions:$conventionsVersion")
}
