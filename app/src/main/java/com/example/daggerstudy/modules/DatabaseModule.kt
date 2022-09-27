package com.example.daggerstudy.modules

import dagger.Module
import dagger.Provides

@Module
class DatabaseModule {

    @Provides
    fun provideDatabaseObject(): DatabaseObject = DatabaseObject()

}