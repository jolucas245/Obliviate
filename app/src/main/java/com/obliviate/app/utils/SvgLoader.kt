package com.obliviate.app.utils

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.decode.SvgDecoder
import coil.request.ImageRequest

@Composable
fun SvgLoader(data: Any, tint: Color) {
    val ctx = LocalContext.current
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(ctx)
            .decoderFactory(SvgDecoder.Factory())
            .data(data)
            .build()
    )
    Icon(
        painter = painter,
        tint = tint,
        modifier = Modifier.size(279.dp),
        contentDescription = null
    )
}