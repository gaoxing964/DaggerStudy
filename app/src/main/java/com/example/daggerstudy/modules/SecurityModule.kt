package com.example.daggerstudy.modules

import dagger.Module
import dagger.Provides

@Module
class SecurityModule {

    @Provides
    fun provideSecurityObject() = SecurityObject()

}