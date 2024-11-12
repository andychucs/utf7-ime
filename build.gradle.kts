// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}
val defaultTargetSdkVersion by extra(35)
val defaultMinSdkVersion by extra(24)
val defaultApplicationId by extra("jp.jun_nama.test.utf7ime")
val compileSdkVersion by extra(34)
