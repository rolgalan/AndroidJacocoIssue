// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.21" apply false
    jacoco
    `jacoco-report-aggregation`
}

allprojects { plugins.withId("jacoco") { the<JacocoPluginExtension>().toolVersion = "0.8.11" } }
