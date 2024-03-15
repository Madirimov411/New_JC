package com.uzb_khiva.gazon_2.util


import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.uzb_khiva.gazon_2.R


fun cardNumber(number: String): String {
    return "${number.substring(0, 4)} **** **** ${number.substring(12, 16)}"
}

fun fontGilroyLight(): FontFamily {
    return FontFamily(
        Font(R.font.gilroy_light),
    )
}

fun fontGilroyMedium(): FontFamily {
    return FontFamily(
        Font(R.font.gilroy_medium),
    )
}

fun fontGilroySemiBold(): FontFamily {
    return FontFamily(
        Font(R.font.gilroy_semibold),
    )
}
