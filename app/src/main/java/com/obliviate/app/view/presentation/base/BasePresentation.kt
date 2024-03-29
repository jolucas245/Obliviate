package com.obliviate.app.view.presentation.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.obliviate.app.R
import com.obliviate.app.utils.Font
import com.obliviate.app.utils.Strings
import com.obliviate.app.utils.SvgLoader

@Composable
fun BasePresentation(
    backgroundColor: Color,
    isObliviateIcon: Boolean,
    imageIcon: Any?,
    color: Color,
    text: String
){
    Box(
        modifier = Modifier
            .background(color = backgroundColor)
    ){
        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp, vertical = 30.dp)
        ) {
            if(isObliviateIcon) {
                Icon(
                    painter = painterResource(id = R.drawable.obliviate),
                    contentDescription = null,
                    tint = Color.LightGray,
                    modifier = Modifier.size(279.dp)
                )
            } else {
                SvgLoader(
                    data = imageIcon!!,
                    color
                )
            }
            Spacer(
                modifier = Modifier.height(50.dp)
            )
            Text(
                text = text,
                color = color,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                fontFamily = Font.acmeFamily
            )
            Spacer(
                modifier = Modifier.height(100.dp)
            )
        }
    }
}