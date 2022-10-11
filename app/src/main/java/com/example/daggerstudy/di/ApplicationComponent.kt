package com.example.daggerstudy.di

import com.example.daggerstudy.FirstFragment
import com.example.daggerstudy.MainActivity
import com.example.daggerstudy.SecondFragment
import com.example.daggerstudy.modules.DatabaseModule
import com.example.daggerstudy.modules.DatabaseObject
import com.example.daggerstudy.modules.HttpModule
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DatabaseModule::class, HttpModule::class], dependencies = [SecurityComponent::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)

    fun inject(fragment: FirstFragment)

    fun inject(fragment: SecondFragment)

}
