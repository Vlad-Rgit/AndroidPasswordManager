package com.happybird.passwordmanager.domain.models

import java.time.LocalDate
import java.time.LocalDateTime

data class Password(
    val id: Long,
    val title: String,
    val value: String,
    val dateCreated: LocalDateTime,
    val dateModified: LocalDateTime
)