package com.glinboy.biller.repository

import com.glinboy.biller.entity.Bill
import org.springframework.data.mongodb.repository.MongoRepository

interface BillRepository : MongoRepository<Bill, String> {
}
