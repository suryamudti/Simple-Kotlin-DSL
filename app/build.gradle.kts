plugins{
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)
    buildToolsVersion(Dependencies.Android.buildToolsVersion)
    defaultConfig {
        applicationId = Dependencies.Android.applicationId
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
        versionCode = Dependencies.Android.versionCode
        versionName = Dependencies.Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {

        getByName("release"){
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.kotlin_std)
    implementation(Dependencies.SupportLibs.appcompat)
    implementation(Dependencies.Kotlin.kotlin_core_ktx)
    implementation(Dependencies.SupportLibs.constraint_layout)
    testImplementation(Dependencies.TestLibs.junit)
    androidTestImplementation(Dependencies.TestLibs.junitExt)
    androidTestImplementation(Dependencies.TestLibs.espresso)
}
