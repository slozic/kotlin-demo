package com.slozic.kotlin.demo.datasource

import com.slozic.kotlin.demo.model.Bank

interface BankDataSource {
    fun retrieveBanks(): Collection<Bank>
}