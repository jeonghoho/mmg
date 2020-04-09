package com.example.mmg

import android.app.Application
import timber.log.Timber

class App : Application() {

    companion object {
        lateinit var app: App
    }

    override fun onCreate() {
        super.onCreate()
        app = this
        Timber.plant(Timber.DebugTree())
    }
}