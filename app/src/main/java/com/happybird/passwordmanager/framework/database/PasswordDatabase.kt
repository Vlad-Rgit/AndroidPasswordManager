package com.happybird.passwordmanager.framework.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.happybird.passwordmanager.framework.database.dao.PasswordDao
import com.happybird.passwordmanager.framework.database.entities.PasswordEntity
import javax.inject.Singleton



@Database(
        entities = [PasswordEntity::class],
        exportSchema = false,
        version = 1
)
abstract class PasswordDatabase: RoomDatabase() {

    abstract val passwordDao: PasswordDao

    companion object {

        const val DATABASE_NAME = "passwordsDB"

        fun createInstance(context: Context): PasswordDatabase {
            return Room.databaseBuilder(
                    context,
                    PasswordDatabase::class.java,
                    DATABASE_NAME
            ).fallbackToDestructiveMigration()
                    .build()
        }
    }
}