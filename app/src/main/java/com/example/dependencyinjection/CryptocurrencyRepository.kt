package com.example.dependencyinjection

interface CryptocurrencyRepository {
    fun getCryptoCurrency() : List<Cryptocurrency>
}