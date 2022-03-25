pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "kotlin_multiapp"
include(":androidApp")
include(":shared")