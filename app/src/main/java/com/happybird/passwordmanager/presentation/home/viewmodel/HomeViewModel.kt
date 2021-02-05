package com.happybird.passwordmanager.presentation.home.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.happybird.passwordmanager.PasswordApp
import com.happybird.passwordmanager.domain.models.Password
import com.happybird.passwordmanager.framework.database.entities.PasswordEntity
import com.happybird.passwordmanager.domain.mapper.EntityMapper
import com.happybird.passwordmanager.framework.database.PasswordDatabase
import com.happybird.passwordmanager.presentation.home.HomeState
import javax.inject.Inject

class HomeViewModel(application: Application)
    : AndroidViewModel(application) {

    @Inject
    lateinit var passwordMapper: EntityMapper<PasswordEntity, Password>



    private val _state = MutableLiveData<HomeState>()
    val state: LiveData<HomeState> = _state

    init {
        val passwordApp = application as PasswordApp
        passwordApp.singletonComponent.inject(this)


    }


}