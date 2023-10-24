package com.glinboy.biller.entity

import java.math.BigDecimal

data class Item(
    val id: String?,
    val no: Int?,
    val description: String?,
    val quantity: Int?,
    val rate: BigDecimal?,
)
