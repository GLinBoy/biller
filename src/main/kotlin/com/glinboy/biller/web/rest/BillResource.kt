package com.glinboy.biller.web.rest

import com.glinboy.biller.entity.Bill
import com.glinboy.biller.service.BillServiceApi
import io.swagger.v3.oas.annotations.Parameter
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.net.URI

@RestController
@RequestMapping("/bills")
class BillResource(private val billService: BillServiceApi) {

    @GetMapping
    fun getBills(@Parameter(hidden = true) pageable: Pageable): ResponseEntity<Page<Bill>> = ResponseEntity.ok(billService.getBills(pageable))

    @GetMapping("/{id}")
    fun getBill(@PathVariable id: String): ResponseEntity<Bill> = billService.getBill(id)
        .map { ResponseEntity.ok(it)}
        .orElseThrow { ResponseStatusException(HttpStatus.NOT_FOUND,
            "Couldn't find bit with id $id") }

    @PostMapping
    fun createBill(@RequestBody bill: Bill): ResponseEntity<Bill> {
        val savedBill: Bill = billService.saveBill(bill)
        return ResponseEntity
            .created(URI("/bills/${savedBill.id}"))
            .body(savedBill)
    }
}
