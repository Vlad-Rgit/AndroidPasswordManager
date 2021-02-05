package com.happybird.passwordmanager.framework.data

import com.happybird.passwordmanager.domain.data.PasswordDataSource
import com.happybird.passwordmanager.domain.mapper.EntityMapper
import com.happybird.passwordmanager.domain.models.Password
import com.happybird.passwordmanager.framework.database.PasswordDatabase
import com.happybird.passwordmanager.framework.database.entities.PasswordEntity
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


class RoomPasswordDataSource @Inject constructor(
    database: PasswordDatabase,
    private val passwordMapper: EntityMapper<PasswordEntity, Password>
)
    : PasswordDataSource {

    private val dao = database.passwordDao

    private val _passwordsFlow = dao.getPasswordsFlow()
        .map { passwordMapper.toDomainList(it) }

    override fun getPasswordsFlow(): StateFlow<List<Password>> {
        return dao.
    }

    override suspend fun addPassword(password: Password) {
        TODO("Not yet implemented")
    }

    override suspend fun removePassword(password: Password) {
        TODO("Not yet implemented")
    }

    override suspend fun updatePassword(password: Password) {
        TODO("Not yet implemented")
    }

}