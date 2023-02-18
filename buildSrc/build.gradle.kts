plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

val conventionsVersion = "2023.02.14"

dependencies {
    implementation("de.c-otto:java-conventions:$conventionsVersion")
}
