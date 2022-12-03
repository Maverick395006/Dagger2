package com.maverick.dagger2cheezycode

import android.app.Application

class UserApplication:Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()

    }
}