package com.example.currency.data

import com.example.currency.models.ConvertCurrency
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface CurrencyRatesApi {

    @GET("latest")
    suspend fun getExchangeRates(@QueryMap queries: Map<String, String>): Response<ConvertCurrency>

}