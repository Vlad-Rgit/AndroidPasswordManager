package com.happybird.passwordmanager.framework.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "passwords")
data class PasswordEntity(
       @PrimaryKey(autoGenerate = true)
       val passwordId: Long,
       val title: String,
       val value: String,
       val dateCreatedMilliseconds: Long,
       val dateModifiedMilliseconds: Long
)