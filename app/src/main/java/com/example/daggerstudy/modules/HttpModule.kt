package com.example.daggerstudy.modules

import dagger.Module

@Module
class HttpModule {

    fun provideHttpObject(): HttpObject = HttpObject()


}