package com.slozic.kotlin.demo.controller

import com.slozic.kotlin.demo.model.Bank
import com.slozic.kotlin.demo.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/banks")
class BankController(private val bankService: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank> {
        return bankService.getBanks()
    }

    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String): Bank {
        return bankService.getBank(accountNumber)
    }

}