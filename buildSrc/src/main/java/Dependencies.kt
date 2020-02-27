private const val kotlinVersion = "1.3.61"
private const val androidGradleVersion = "3.5.3"
private const val kotlinCoreKtxVersion = "1.2.0"

//support libs
private const val appcompatVersion = "1.1.0"
private const val constraintLayoutVersion = "1.1.3"

//test libs
private const val junitVersion = "4.12"
private const val junitExtVersion = "1.1.1"
private const val runnerVersion = "1.1.0"
private const val espressoVersion = "3.2.0"

object Dependencies{
    object Android {
        val minSdkVersion = 16
        val targetSdkVersion = 29
        val compileSdkVersion = 29
        val buildToolsVersion = "29.0.3"
        val applicationId = "com.example.learndsl"
        val versionCode = 1
        val versionName = "0.1"
    }
    object Kotlin{
        val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
        val kotlin_core_ktx = "androidx.core:core-ktx:$kotlinCoreKtxVersion"
    }

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }
    object SupportLibs{
        val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
        val constraint_layout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    }
    object TestLibs{
        val junit = "junit:junit:$junitVersion"
        val junitExt = "androidx.test.ext:junit:$junitExtVersion"
        val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
        val runner = "androidx.test:runner:$runnerVersion"
    }
}