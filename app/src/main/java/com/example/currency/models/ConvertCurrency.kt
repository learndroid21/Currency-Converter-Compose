package com.example.currency.models


import com.google.gson.annotations.SerializedName

data class ConvertCurrency(
    @SerializedName("base")
    val base: String, // EUR
    @SerializedName("date")
    val date: String, // 2021-02-26
    @SerializedName("rates")
    val rates: Rates
)