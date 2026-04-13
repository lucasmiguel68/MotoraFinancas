package com.example.motorafinanas.models

import androidx.compose.ui.graphics.Color

enum class AppTransporte(
    val displayName: String,
    val colorHex: Long,
    val textColor: Color = Color.White
) {
    UBER("Uber", 0xFF000000, Color.White),
    NINETY_NINE("99", 0xFFFFD500, Color.Black),
    CABIFY("Cabify", 0xFF732BE2, Color.White),
    OUTRO("Outro", 0xFF808080, Color.White);

    val color: Color
        get() = Color(colorHex)
}