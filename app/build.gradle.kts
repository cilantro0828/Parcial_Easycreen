plugins {

    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.easycreen"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.easycreen"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    // Dependencias de la aplicación
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.activity)
    implementation(libs.play.services.maps)
    implementation(libs.uiautomator)
    implementation(libs.ext.junit)
    implementation(libs.espresso.core)
    implementation(libs.firebase.auth)
    implementation(libs.firebase.firestore)
    androidTestImplementation("junit:junit:4.12")
}
