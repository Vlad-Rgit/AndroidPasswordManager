package com.happybird.passwordmanager.domain.data

import com.happybird.passwordmanager.domain.models.Password
import kotlinx.coroutines.flow.StateFlow


interface PasswordDataSource {
    fun getPasswordsFlow(): StateFlow<List<Password>>
    suspend fun addPassword(password: Password)
    suspend fun removePassword(password: Password)
    suspend fun updatePassword(password: Password)
}