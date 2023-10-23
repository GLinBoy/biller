package com.glinboy.biller.service.impl

import com.glinboy.biller.entity.Bill
import com.glinboy.biller.repository.BillRepository
import com.glinboy.biller.service.BillServiceApi
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import java.util.*

@Service
class BillServiceImpl(private val billRepository: BillRepository) : BillServiceApi {
    override fun getBills(pageable: Pageable): Page<Bill> = billRepository.findAll(pageable)
    override fun getBill(id: String): Optional<Bill> = billRepository.findById(id)
    override fun saveBill(bill: Bill): Bill = billRepository.save(bill)
}
