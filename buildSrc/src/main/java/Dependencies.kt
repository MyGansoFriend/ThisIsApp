object Dependencies {

    object Core {
        const val ktxCore = "androidx.core:core-ktx:1.7.0"
        const val ktxRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1"
    }

    object Compose {
        private const val version = "1.2.1"
        const val versionCompiler = "1.3.1"

        const val ui = "androidx.compose.ui:ui:$version"
        const val activity = "androidx.activity:activity-compose:1.6.0"
        const val material = "androidx.compose.material:material:$version"
        const val preview = "androidx.compose.ui:ui-tooling-preview:$version"

        const val composeJUnit = "androidx.compose.ui:ui-test-junit4:$version"
        const val composeUITooling = "androidx.compose.ui:ui-tooling:$version"
        const val composeUITestManifest = "androidx.compose.ui:ui-test-manifest:$version"
    }

    object Coroutines {
        private const val version = "1.6.4"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    }
}