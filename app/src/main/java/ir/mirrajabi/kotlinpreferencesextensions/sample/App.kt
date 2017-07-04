package ir.mirrajabi.kotlinpreferencesextensions.sample

import android.app.Application
import ir.mirrajabi.kotlinpreferencesextensions.KotlinPreferences

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        KotlinPreferences.init(this)
    }
}
