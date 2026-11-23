plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "io.github.storytold.vectorcraft"
    compileSdk = 35

    defaultConfig {
        applicationId = "io.github.storytold.vectorcraft"
        minSdk = 26
        targetSdk = 35
        versionCode = 241
        versionName = "0.24.1"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.webkit:webkit:1.12.1")
}
