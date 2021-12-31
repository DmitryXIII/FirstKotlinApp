package com.ineedyourcode.firstkotlinapp

import java.text.SimpleDateFormat
import java.util.*

fun getCurrentTime(): String {
    val dateFormat = SimpleDateFormat("dd.MM.yyyy HH:mm:ss")
    return dateFormat.format(Calendar.getInstance().time)
}