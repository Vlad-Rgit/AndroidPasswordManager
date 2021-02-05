package com.happybird.passwordmanager.framework.utils

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.temporal.Temporal
import java.time.temporal.TemporalAccessor

fun millisecondsToLocalDateTime(milliseconds: Long): LocalDateTime {
    return Instant.ofEpochMilli(milliseconds)
        .atZone(ZoneOffset.systemDefault())
        .toLocalDateTime()
}


fun localDateTimeToMilliseconds(localDateTime: LocalDateTime): Long {
    return localDateTime.atZone(ZoneId.systemDefault())
        .toInstant()
        .toEpochMilli()
}