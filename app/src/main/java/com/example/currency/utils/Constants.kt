package com.example.currency.utils

import com.example.currency.models.CurrencyAndCountry

class Constants {
    companion object {

        const val APP_BAR_TITLE = "Currency\nConverter"

        const val BASE_URL = "https://api.exchangeratesapi.io/"

        val CURRENCY_CODES_LIST = listOf(
            CurrencyAndCountry("Australia", "AUD"),
            CurrencyAndCountry("Brazil", "BRL"),
            CurrencyAndCountry("Bulgaria", "BGN"),
            CurrencyAndCountry("Canada", "CAD"),
            CurrencyAndCountry("China", "CNY"),
            CurrencyAndCountry("Croatia", "HRK"),
            CurrencyAndCountry("Czech Republic", "CZK"),
            CurrencyAndCountry("Denmark", "DKK"),
            CurrencyAndCountry("European Union", "EUR"),
            CurrencyAndCountry("Great Britain", "GBP"),
            CurrencyAndCountry("Hong Kong", "HKD"),
            CurrencyAndCountry("Hungary", "HUF"),
            CurrencyAndCountry("Iceland", "ISK"),
            CurrencyAndCountry("India", "INR"),
            CurrencyAndCountry("Indonesia", "IDR"),
            CurrencyAndCountry("Israel", "ILS"),
            CurrencyAndCountry("Japan", "JPY"),
            CurrencyAndCountry("Korea", "KRW"),
            CurrencyAndCountry("Malaysia", "MYR"),
            CurrencyAndCountry("Mexico", "MXN"),
            CurrencyAndCountry("New Zealand", "NZD"),
            CurrencyAndCountry("Norway", "NOK"),
            CurrencyAndCountry("Philippines", "PHP"),
            CurrencyAndCountry("Poland", "PLN"),
            CurrencyAndCountry("Romania", "RON"),
            CurrencyAndCountry("Russia", "RUB"),
            CurrencyAndCountry("Singapore", "SGD"),
            CurrencyAndCountry("South Africa", "ZAR"),
            CurrencyAndCountry("Sweden", "SEK"),
            CurrencyAndCountry("Switzerland", "CHF"),
            CurrencyAndCountry("Thailand", "THB"),
            CurrencyAndCountry("Turkey", "TRY"),
            CurrencyAndCountry("United States", "USD"),
        )
    }
}