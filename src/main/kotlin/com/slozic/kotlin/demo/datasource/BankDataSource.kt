package com.slozic.kotlin.demo.datasource

import com.slozic.kotlin.demo.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
}