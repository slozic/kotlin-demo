package com.slozic.kotlin.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlindemoApplication

fun main(args: Array<String>) {
	runApplication<KotlindemoApplication>(*args)
}
