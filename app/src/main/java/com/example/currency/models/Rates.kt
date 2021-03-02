package com.example.currency.models


import com.google.gson.annotations.SerializedName

data class Rates(
    @SerializedName("AUD")
    val aUD: Double, // 1.5605
    @SerializedName("BGN")
    val bGN: Double, // 1.9558
    @SerializedName("BRL")
    val bRL: Double, // 6.6644
    @SerializedName("CAD")
    val cAD: Double, // 1.5331
    @SerializedName("CHF")
    val cHF: Double, // 1.0986
    @SerializedName("CNY")
    val cNY: Double, // 7.8385
    @SerializedName("CZK")
    val cZK: Double, // 26.195
    @SerializedName("DKK")
    val dKK: Double, // 7.4361
    @SerializedName("EUR")
    val eUR: Double,
    @SerializedName("GBP")
    val gBP: Double, // 0.87053
    @SerializedName("HKD")
    val hKD: Double, // 9.401
    @SerializedName("HRK")
    val hRK: Double, // 7.583
    @SerializedName("HUF")
    val hUF: Double, // 361.43
    @SerializedName("IDR")
    val iDR: Double, // 17353.51
    @SerializedName("ILS")
    val iLS: Double, // 4.0072
    @SerializedName("INR")
    val iNR: Double, // 89.5766
    @SerializedName("ISK")
    val iSK: Double, // 152.9
    @SerializedName("JPY")
    val jPY: Double, // 128.83
    @SerializedName("KRW")
    val kRW: Double, // 1367.1
    @SerializedName("MXN")
    val mXN: Double, // 25.2879
    @SerializedName("MYR")
    val mYR: Double, // 4.9096
    @SerializedName("NOK")
    val nOK: Double, // 10.4012
    @SerializedName("NZD")
    val nZD: Double, // 1.6622
    @SerializedName("PHP")
    val pHP: Double, // 59.09
    @SerializedName("PLN")
    val pLN: Double, // 4.5186
    @SerializedName("RON")
    val rON: Double, // 4.875
    @SerializedName("RUB")
    val rUB: Double, // 90.6697
    @SerializedName("SEK")
    val sEK: Double, // 10.1388
    @SerializedName("SGD")
    val sGD: Double, // 1.6106
    @SerializedName("THB")
    val tHB: Double, // 36.799
    @SerializedName("TRY")
    val tRY: Double, // 9.0168
    @SerializedName("USD")
    val uSD: Double, // 1.2121
    @SerializedName("ZAR")
    val zAR: Double // 18.1025
)