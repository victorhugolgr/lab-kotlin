package br.com.victorhugolgr.labkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class LabKotlinApplication

fun main(args: Array<String>) {
	runApplication<LabKotlinApplication>(*args)
}