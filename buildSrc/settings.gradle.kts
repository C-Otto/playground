dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            from("de.c-otto:version-catalog:2023.01.29")
        }
    }
}
