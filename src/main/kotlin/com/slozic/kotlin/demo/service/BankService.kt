package com.slozic.kotlin.demo.service

import com.slozic.kotlin.demo.datasource.BankDataSource
import com.slozic.kotlin.demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank {
       return dataSource.retrieveBank(accountNumber)
    }

}