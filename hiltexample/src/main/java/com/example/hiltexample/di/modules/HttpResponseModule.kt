package com.example.hiltexample.di.modules

import com.example.hiltexample.obj.HttpResponseObject
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class HttpResponseModule {

    @Provides
    fun getHttpModule(): HttpResponseObject {
        return HttpResponseObject()
    }
}