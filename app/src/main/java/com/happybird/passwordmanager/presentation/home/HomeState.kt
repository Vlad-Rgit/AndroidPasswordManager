package com.happybird.passwordmanager.presentation.home

import com.happybird.passwordmanager.domain.models.Password

sealed class HomeState {
    object Loading: HomeState()
    data class ListState(val list: List<Password>): HomeState()
}