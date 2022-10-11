package com.example.daggerstudy.di

import com.example.daggerstudy.modules.SecurityModule
import com.example.daggerstudy.modules.SecurityObject
import dagger.Component
import javax.inject.Singleton


@SecurityScope
@Component(modules = [SecurityModule::class])
interface SecurityComponent {
    fun provideSecurityObject(): SecurityObject
}