package com.happybird.passwordmanager.framework.di.modules

import com.happybird.passwordmanager.domain.models.Password
import com.happybird.passwordmanager.framework.database.entities.PasswordEntity
import com.happybird.passwordmanager.domain.mapper.EntityMapper
import com.happybird.passwordmanager.framework.mappers.PasswordMapper
import dagger.Binds
import dagger.Module

@Module
abstract class MappersModule {

    @Binds
    abstract fun bindPasswordMapper(impl: PasswordMapper)
        : EntityMapper<PasswordEntity, Password>

}