package com.glinboy.biller.repository

import com.glinboy.biller.entity.Item
import org.springframework.data.mongodb.repository.MongoRepository

interface ItemRepository : MongoRepository<Item, String> {
}
