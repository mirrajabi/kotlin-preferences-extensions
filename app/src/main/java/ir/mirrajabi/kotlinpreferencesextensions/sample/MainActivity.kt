package ir.mirrajabi.kotlinpreferencesextensions.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import ir.mirrajabi.kotlinpreferencesextensions.getBoolean
import ir.mirrajabi.kotlinpreferencesextensions.getString
import ir.mirrajabi.kotlinpreferencesextensions.putBoolean
import ir.mirrajabi.kotlinpreferencesextensions.putString
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testFeatures()
    }

    fun testFeatures() {
        keyForString.putString("Kotlin extensions").subscribe()
        "another_key".putBoolean(true).subscribe({
            Log.v(packageName, "another key has been saved with $it value")
        })

        keyForString.getString("No records for this key").subscribe({ textView.text = it })
        "another_key".getBoolean().subscribe({
            Log.v(packageName, "Saved boolean value is $it")
        })
    }

    companion object {
        val keyForString = "key_some_string"
    }
}