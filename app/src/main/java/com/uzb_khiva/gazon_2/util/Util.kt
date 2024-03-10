package com.uzb_khiva.gazon_2.util


fun cardNumber(number: String): String {
    return "${number.substring(0, 4)} **** **** ${number.substring(12, 16)}"
}
