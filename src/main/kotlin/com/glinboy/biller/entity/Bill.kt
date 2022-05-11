package com.glinboy.biller.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Bill(@Id val id: String)
