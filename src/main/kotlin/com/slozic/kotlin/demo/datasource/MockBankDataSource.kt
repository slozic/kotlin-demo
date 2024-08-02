package com.slozic.kotlin.demo.datasource

import com.slozic.kotlin.demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    private val banks = mutableListOf(
        Bank("1234", 1.0, 17),
        Bank("4567", 3.14, 0),
        Bank("0007", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank =
        banks.firstOrNull() { it.accountNumber == accountNumber }
            ?: throw NoSuchElementException("Could not find a bank ith account number $accountNumber")

    override fun createBank(bank: Bank): Bank {
        if (banks.any { it.accountNumber == bank.accountNumber }) {
            throw IllegalArgumentException("Bank with account number already exists ${bank.accountNumber}")
        }
        banks.add(bank)
        return bank
    }
}