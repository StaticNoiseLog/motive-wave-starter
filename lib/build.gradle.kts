/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java library project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.4.2/userguide/building_java_projects.html
 * This project uses @Incubating APIs which are subject to change.
 */
plugins {
    `java-library`
    id("pl.allegro.tech.build.axion-release") version "1.13.6"
}
version = scmVersion.version

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

dependencies {}

testing {
    suites {
        // Configure the built-in test suite
        val test by getting(JvmTestSuite::class) {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.8.1")
        }
    }
}

//val allEnvs = System.getenv()
//allEnvs.forEach { (k, v) -> println("$k => $v") }

val envHome = System.getenv("HOME")
project.logger.lifecycle("User: ${envHome}")


