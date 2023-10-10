package com.glinboy.biller.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Bill(
    @Id val id: String?,
    val createdAt: LocalDateTime?,
    val items: Set<Item>?
)
