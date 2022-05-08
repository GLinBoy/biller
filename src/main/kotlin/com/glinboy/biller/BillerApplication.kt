package com.glinboy.biller

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BillerApplication

fun main(args: Array<String>) {
	runApplication<BillerApplication>(*args)
}
