package com.glinboy.biller.web.rest

import com.glinboy.biller.entity.Bill
import com.glinboy.biller.service.BillServiceApi
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import java.util.*

@RestController
@RequestMapping("/bills")
class BillResource(private val billService: BillServiceApi) {

    @GetMapping
    fun getBills(pageable: Pageable): ResponseEntity<Page<Bill>> = ResponseEntity.ok(billService.getBills(pageable))

}
