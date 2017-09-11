# kotlin-preferences-extensions

[![](https://jitpack.io/v/mirrajabi/kotlin-preferences-extensions.svg)](https://jitpack.io/#mirrajabi/kotlin-preferences-extensions)

A set of Rx Extensions to get/set values of SharedPreferences in a super simple way

# Usage

First add jitpack to your projects build.gradle file

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}
```

Then add the dependency in modules build.gradle file

```gradle
dependencies {
    compile 'com.github.mirrajabi:kotlin-preferences-extensions:1.0'
}
```

Now initialize it in your application or activity etc...

```kotlin
override fun onCreate() {
        super.onCreate()
        KotlinPreferences.init(this)
        // Or with your custom preference name
        KotlinPreferences.init(this, "custom_pref")
    }
```
Then use these extensions on the `key` strings like below samples

# Sample

```kotlin
companion object {
    val keyForString = "key_some_string"
}

keyForString.putString("Kotlin extensions")
            .subscribe()
            
"another_key".putBoolean(true)
             .subscribe({
                Log.v(packageName, "another key has been saved with $it value")
             })

keyForString.getString("No records for this key")
            .subscribe({ textView.text = it })
            
"another_key".getBoolean()
             .subscribe({
                Log.v(packageName, "Saved boolean value is $it")
             })
```
