package com.uzb_khiva.gazon_2.model

data class Placed(
    val id: Int,
    val maydonNomi: String,
    val manzil: String,
    val sana:String,
    val vaqt:String,
    val rate:String,
    val narx:String,
    val imageList: List<String>
)

