package com.example.daggerstudy.di

import com.example.daggerstudy.MainActivity
import com.example.daggerstudy.modules.DatabaseModule
import com.example.daggerstudy.modules.DatabaseObject
import com.example.daggerstudy.modules.HttpModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class, HttpModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

}
