package com.happybird.passwordmanager.framework.di.components

import android.content.Context
import com.happybird.passwordmanager.presentation.home.viewmodel.HomeViewModel
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component
interface SingletonComponent {

    fun inject(item: HomeViewModel)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun context(context: Context): Builder

        fun build(): SingletonComponent
    }
}