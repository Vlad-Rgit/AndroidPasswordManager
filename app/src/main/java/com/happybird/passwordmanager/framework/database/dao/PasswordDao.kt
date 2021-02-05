package com.happybird.passwordmanager.framework.database.dao

import androidx.room.*
import com.happybird.passwordmanager.framework.database.entities.PasswordEntity
import kotlinx.coroutines.flow.Flow


@Dao
interface PasswordDao {

    @Query("Select * from passwords")
    fun getPasswordsFlow(): Flow<List<PasswordEntity>>

    @Insert
    suspend fun insert(password: PasswordEntity)

    @Delete
    suspend fun delete(password: PasswordEntity)

    @Update
    suspend fun update(password: PasswordEntity)
}