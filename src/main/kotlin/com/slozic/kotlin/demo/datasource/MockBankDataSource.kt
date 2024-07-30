package com.slozic.kotlin.demo.datasource

import com.slozic.kotlin.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    private val banks = listOf(
        Bank("1234", 1.0, 1),
        Bank("4567", 5.0, 0),
        Bank("0007", 0.0, 100)
    )
    override fun retrieveBanks(): Collection<Bank> = banks
}