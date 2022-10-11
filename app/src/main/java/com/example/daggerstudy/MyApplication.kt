package com.example.daggerstudy

import android.app.Application
import com.example.daggerstudy.di.ApplicationComponent
import com.example.daggerstudy.di.DaggerApplicationComponent
import com.example.daggerstudy.di.DaggerSecurityComponent
import com.example.daggerstudy.di.SecurityComponent

class MyApplication : Application() {


    var daggerApplicationComponent: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        daggerApplicationComponent = DaggerApplicationComponent.builder().securityComponent(DaggerSecurityComponent.create()).build()

    }

}