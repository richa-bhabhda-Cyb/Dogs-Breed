plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.cybage.dogsbreedapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.cybage.dogsbreedapp"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt") ,
                    "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    dependencies {
        //ViewModel
        implementation (libs.lifecycle.viewmodel.compose)
        //Retrofit
        implementation (libs.retrofit)
        implementation (libs.converter.gson)
        implementation (libs.gson)
        //Coil
        implementation(libs.coil.compose)

    }


    // Dagger Core
    implementation (libs.google.dagger)
    annotationProcessor(libs.google.dagger.compiler)

// Dagger Android Support
    implementation (libs.com.google.dagger.dagger.android)
    implementation (libs.dagger.android.support)
    annotationProcessor (libs.dagger.android.processor)

// Hilt Core
    implementation (libs.hilt.android)
//    kapt (libs.hilt.android.compiler)

// Hilt ViewModels
    implementation (libs.androidx.hilt.lifecycle.viewmodel)
//    kapt (libs.androidx.hilt.compiler)




}