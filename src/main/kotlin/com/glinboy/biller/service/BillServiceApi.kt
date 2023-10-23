package com.glinboy.biller.service

import com.glinboy.biller.entity.Bill
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.util.*

interface BillServiceApi {
    fun getBills(pageable: Pageable): Page<Bill>
    fun getBill(id: String): Optional<Bill>
    fun saveBill(bill: Bill): Bill
}
