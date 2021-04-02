https://github.com/tbroyer/gradle-errorprone-plugin/issues/59

```
$ ./gradlew clean build --no-build-cache --configuration-cache
Configuration cache is an incubating feature.
Calculating task graph as no configuration cache is available for tasks: clean build

BUILD SUCCESSFUL in 4s
12 actionable tasks: 12 executed
Configuration cache entry stored.
$ ./gradlew clean build --no-build-cache --configuration-cache
Configuration cache is an incubating feature.
Reusing configuration cache.
> Task :subproject-one:compileJava FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':subproject-one:compileJava'.
> Extension with name 'errorprone' does not exist. Currently registered extension names: [ext]

* Try:
Run with --stacktrace option to get the stack trace. Run with --info or --debug option to get more log output. Run with --scan to get full insights.

* Get more help at https://help.gradle.org

BUILD FAILED in 679ms
4 actionable tasks: 4 executed
Configuration cache entry reused.
```
