package com.glinboy.biller.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate
import java.time.LocalDateTime

@Document
data class Bill(
    @Id val id: String?,
    val invoiceNumber: Long?,
    val invoiceDate: LocalDate?,
    val items: Set<Item>?,
    val customer: Customer?,
    val createdAt: LocalDateTime?,
)
