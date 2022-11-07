plugins {
    id("playground.tests")
}

val sharedTestClasses: Configuration by configurations.creating {
    isCanBeConsumed = false
    isCanBeResolved = true
}
val sharedTestRuntimeClasspath: Configuration by configurations.creating {
    isCanBeConsumed = false
    isCanBeResolved = true
    extendsFrom(configurations.testRuntimeClasspath.get())
}

dependencies {
    sharedTestClasses(project(path = ":architecture-tests", configuration = "exposedTestClasses"))
    sharedTestRuntimeClasspath(project(path = ":architecture-tests", configuration = "exposedTestRuntimeClasspath"))
}


val sharedTest = tasks.register<Test>("sharedTest") {
    useJUnitPlatform()
    dependsOn(":architecture-tests:processTestResources")
    description = "Runs the tests shared by all subprojects."
    group = "verification"

    testClassesDirs = sharedTestClasses
    classpath = sharedTestRuntimeClasspath

    classpath += sourceSets.getByName("test").runtimeClasspath
    classpath += sourceSets.getByName("integrationTest").runtimeClasspath
}
tasks.named("check") {
    dependsOn(sharedTest)
}
