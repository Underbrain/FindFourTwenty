pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "find-four-twenty"
include(":app")

include(":expo")
project(":expo").projectDir = File(rootProject.projectDir, "./node_modules/expo/android")

include(":expo-asset")
project(":expo-asset").projectDir = File(rootProject.projectDir, "./node_modules/expo-asset/android")

include(":expo-constants")
project(":expo-constants").projectDir = File(rootProject.projectDir, "./node_modules/expo-constants/android")

include(":expo-file-system")
project(":expo-file-system").projectDir = File(rootProject.projectDir, "./node_modules/expo-file-system/android")

include(":expo-font")
project(":expo-font").projectDir = File(rootProject.projectDir, "./node_modules/expo-font/android")

include(":expo-keep-awake")
project(":expo-keep-awake").projectDir = File(rootProject.projectDir, "./node_modules/expo-keep-awake/android")

include(":expo-linear-gradient")
project(":expo-linear-gradient").projectDir = File(rootProject.projectDir, "./node_modules/expo-linear-gradient/android")

include(":expo-modules-core")
project(":expo-modules-core").projectDir = File(rootProject.projectDir, "./node_modules/expo-modules-core/android")

include(":react-native-maps")
project(":react-native-maps").projectDir = File(rootProject.projectDir, "./node_modules/react-native-maps/lib/android")

apply {
    from(File(rootProject.projectDir, "./node_modules/react-native/scripts/autolinking.gradle"))
}
apply {
    from(File(rootProject.projectDir, "./node_modules/expo/scripts/autolinking.gradle"))
}
