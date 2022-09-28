package com.example.daggerstudy

import android.app.Application
import com.example.daggerstudy.di.ApplicationComponent
import com.example.daggerstudy.di.DaggerApplicationComponent

class MyApplication : Application() {


    var daggerApplicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        daggerApplicationComponent = DaggerApplicationComponent.create()

    }

}