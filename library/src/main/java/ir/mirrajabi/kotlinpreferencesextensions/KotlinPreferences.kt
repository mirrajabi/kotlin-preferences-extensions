package ir.mirrajabi.kotlinpreferencesextensions

import android.content.Context
import android.content.SharedPreferences

object KotlinPreferences {
    var sharedPreferences: SharedPreferences? = null
    fun init(context: Context, preferencesName: String = context.packageName){
        sharedPreferences = context.getSharedPreferences(preferencesName, Context.MODE_PRIVATE)
    }
}