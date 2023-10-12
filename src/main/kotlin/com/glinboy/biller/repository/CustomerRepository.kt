package com.glinboy.biller.repository

import com.glinboy.biller.entity.Customer
import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository : MongoRepository<Customer, String> {
}
