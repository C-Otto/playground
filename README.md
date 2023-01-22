# Playground
A simple project combining
 * Gradle 8
 * Java 17 with modules support (JPMS / Project Jigsaw)
 * Dependency versions provided via external Java Platform
   * https://github.com/C-Otto/java-platform
 * External Conventions Plugin:
   * https://github.com/C-Otto/java-conventions 
   * Error Prone (including NullAway)
   * SpotBugs
   * Checkstyle
   * PMD
   * CPD
   * JaCoCo (code coverage)
   * Integration Tests (via Test Suite Plugin)
   * Mutation Tests (PIT)
 * SLF4J Test
 * Shared Tests run for each subproject:
   * used for architecture tests (with ArchUnit), including package cycle detection
