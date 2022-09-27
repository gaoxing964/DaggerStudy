package com.example.daggerstudy.modules

import dagger.Module
import dagger.Provides

@Module
class HttpModule {

    @Provides
    fun provideHttpObject(): HttpObject = HttpObject()


}