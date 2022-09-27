package com.example.daggerstudy.modules

import dagger.Module

@Module
class DatabaseModule {

    fun provideDatabaseObject(): DatabaseObject = DatabaseObject()

}