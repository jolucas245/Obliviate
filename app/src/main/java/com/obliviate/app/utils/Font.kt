package com.obliviate.app.utils

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.obliviate.app.R

class Font {
    companion object{
        val acmeFamily = FontFamily(
            Font(R.font.acme_regular, FontWeight.Normal)
        )
    }
}