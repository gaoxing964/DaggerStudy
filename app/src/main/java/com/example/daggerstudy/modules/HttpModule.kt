package com.example.daggerstudy.modules

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HttpModule {

    @Singleton
    @Provides
    fun provideHttpObject(): HttpObject = HttpObject()


    @Provides
    fun provideProvisioningManager(): ProvisioningManager = ProvisioningManager()


}