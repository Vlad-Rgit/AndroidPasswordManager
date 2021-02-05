package com.happybird.passwordmanager.framework.di.modules

import android.content.Context
import com.happybird.passwordmanager.framework.database.PasswordDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DataModule {

    @Singleton
    @Provides
    fun providePasswordDatabase(context: Context): PasswordDatabase {
        return PasswordDatabase.createInstance(context)
    }
}