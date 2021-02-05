package com.happybird.passwordmanager

import android.app.Application
import com.happybird.passwordmanager.framework.di.components.DaggerSingletonComponent
import com.happybird.passwordmanager.framework.di.components.SingletonComponent
import dagger.internal.DaggerCollections

class PasswordApp: Application() {

    private lateinit var _singletonComponent: SingletonComponent

    val singletonComponent
        get() = _singletonComponent

    override fun onCreate() {
        super.onCreate()
        _singletonComponent = DaggerSingletonComponent
                .builder()
                .context(applicationContext)
                .build()
    }
}