package com.happybird.passwordmanager.framework.mappers

import com.happybird.passwordmanager.domain.mapper.EntityMapper
import com.happybird.passwordmanager.domain.models.Password
import com.happybird.passwordmanager.framework.database.entities.PasswordEntity
import com.happybird.passwordmanager.framework.utils.localDateTimeToMilliseconds
import com.happybird.passwordmanager.framework.utils.millisecondsToLocalDateTime

class PasswordMapper: EntityMapper<PasswordEntity, Password> {

    override fun toDomain(entity: PasswordEntity): Password {
        return Password(
            entity.passwordId,
            entity.title,
            entity.value,
            millisecondsToLocalDateTime(
                entity.dateCreatedMilliseconds
            ),
            millisecondsToLocalDateTime(
                entity.dateModifiedMilliseconds
            )
        )
    }

    override fun toEntity(domain: Password): PasswordEntity {
         return PasswordEntity(
             domain.id,
             domain.title,
             domain.value,
             localDateTimeToMilliseconds(domain.dateCreated),
             localDateTimeToMilliseconds(domain.dateModified)
         )
    }

}