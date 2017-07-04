package ir.mirrajabi.kotlinpreferencesextensions

import android.content.Context
import android.content.SharedPreferences

object KotlinPreferences {
    var sharedPreferences: SharedPreferences? = null
    fun init(context: Context){
        sharedPreferences = context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    }
}