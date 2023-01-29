plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

val conventionsVersion = "2023.01.29_3"

dependencies {
    implementation("de.c-otto:java-conventions:$conventionsVersion")
}
