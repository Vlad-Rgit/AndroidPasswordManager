package com.happybird.passwordmanager.domain.mapper

interface EntityMapper<Entity, Domain> {
    fun toDomain(entity: Entity): Domain
    fun toEntity(domain: Domain): Entity

    fun toDomainList(entities: List<Entity>): List<Domain> {
        return entities.map {
            toDomain(it)
        }
    }

    fun toEntityList(domains: List<Domain>): List<Entity> {
        return domains.map {
            toEntity(it)
        }
    }
}