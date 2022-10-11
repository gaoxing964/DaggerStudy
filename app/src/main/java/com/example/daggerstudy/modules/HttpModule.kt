package com.example.daggerstudy.modules

import com.example.daggerstudy.di.ApplicationScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HttpModule {

    @ApplicationScope
    @Provides
    fun provideHttpObject(): HttpObject = HttpObject()


    @Provides
    fun provideProvisioningManager(): ProvisioningManager = ProvisioningManager()


}