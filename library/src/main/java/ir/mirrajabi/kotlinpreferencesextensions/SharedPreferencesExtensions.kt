package ir.mirrajabi.kotlinpreferencesextensions

import io.reactivex.Observable

fun String.getBoolean(defaultValue: Boolean = false) : Observable<Boolean> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.create({
            it.onNext(sharedPreferences?.getBoolean(this, defaultValue))
            it.onComplete()
        })
    }
}

fun String.getInt(defaultValue: Int = 0) : Observable<Int> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.create({
            it.onNext(sharedPreferences?.getInt(this, defaultValue))
            it.onComplete()
        })
    }
}

fun String.getFloat(defaultValue: Float = 0f) : Observable<Float> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.create({
            it.onNext(sharedPreferences?.getFloat(this, defaultValue))
            it.onComplete()
        })
    }
}

fun String.getLong(defaultValue: Long = 0L) : Observable<Long> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.create({
            it.onNext(sharedPreferences?.getLong(this, defaultValue))
            it.onComplete()
        })
    }
}

fun String.getString(defaultValue: String) : Observable<String> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.create({
            it.onNext(sharedPreferences?.getString(this, defaultValue))
            it.onComplete()
        })
    }
}

fun String.getStringSet(defaultValue: Set<String>) : Observable<Set<String>> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.create({
            it.onNext(sharedPreferences?.getStringSet(this, defaultValue))
            it.onComplete()
        })
    }
}

fun String.putString(value: String) : Observable<String> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.just(value)
                .doOnNext {
                    sharedPreferences?.edit()?.putString(this, value)?.apply()
                }
    }
}

fun String.putInt(value: Int) : Observable<Int> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.just(value)
                .doOnNext {
                    sharedPreferences?.edit()?.putInt(this, value)?.apply()
                }
    }
}

fun String.putLong(value: Long) : Observable<Long> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.just(value)
                .doOnNext {
                    sharedPreferences?.edit()?.putLong(this, value)?.apply()
                }
    }
}

fun String.putBoolean(value: Boolean) : Observable<Boolean> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.just(value)
                .doOnNext {
                    sharedPreferences?.edit()?.putBoolean(this, value)?.apply()
                }
    }
}

fun String.putFloat(value: Float) : Observable<Float> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.just(value)
                .doOnNext {
                    sharedPreferences?.edit()?.putFloat(this, value)?.apply()
                }
    }
}

fun String.putStringSet(value: Set<String>) : Observable<Set<String>> {
    KotlinPreferences.sharedPreferences.let { sharedPreferences ->
        return Observable.just(value)
                .doOnNext {
                    sharedPreferences?.edit()?.putStringSet(this, value)?.apply()
                }
    }
}