Starter Project for MotiveWave Development
==========================================






How This Project Was Created
----------------------------
This is a Gradle project for Java, meant for Git as the VCS.

### Gradle Init ###
```
../some/where/else/gradlew init

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 3

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 3

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Groovy) [1..2] 2

Generate build using new APIs and behavior (some features may change in the nexyesinor release)? (default: no) [yes, no] yes

Select test framework:
  1: JUnit 4
  2: TestNG
  3: Spock
  4: JUnit Jupiter
Enter selection (default: JUnit Jupiter) [1..4] 4

Project name (default: motive-wave-starter):
Source package (default: motive.wave.starter): com.staticnoiselog.mw

> Task :init
Get more help with your project: https://docs.gradle.org/7.4.2/samples/sample_building_java_libraries.html

BUILD SUCCESSFUL in 4m 33s
2 actionable tasks: 2 executed
```
### Java Toolchain ###
Setting JAVA_HOME determines the Java version used when running *Gradle* on the command line.

By default, Gradle uses the same Java version for running Gradle itself and  building JVM projects. But this is not
always desirable.

Gradle 6.7 has introduced [Java toolchain support](https://docs.gradle.org/current/userguide/toolchains.html). In a
nutshell, it allows you to run Gradle with whatever version  of Java you have installed, while Gradle builds the project
with the version of Java declared in a single place. Gradle will automatically configure the build, detect already
installed JDKs and  download the required JDK if it is not already installed.

This project uses Gradle's toolchain support feature and explicitly specifies the JDK version for building the project
in `build.gradle.kts`.  
*Note that the JDK will be automatically downloaded by Gradle if it is not available and installed under
`$USER_HOME/.gradle`.*

### .gitignore ###
The `.gitignore` file was changed so that this project can be used easily with the most popular Java IDEs.

### Versioning ###
The [axion-release-plugin](https://axion-release-plugin.readthedocs.io/en/latest/) is used for versioning.

