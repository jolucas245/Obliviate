package com.obliviate.app.view.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.obliviate.app.R
import com.obliviate.app.utils.Strings
import com.obliviate.app.view.presentation.base.BasePresentation

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PresentationView(){
    val scope = rememberCoroutineScope()
    val presentationList = mutableListOf("Obliviate", "Lufa-Lufa", "Corvinal", "Grifinoria", "Sonserina")
    val pagerState = rememberPagerState(initialPage = 0, pageCount = {presentationList.size})

    Box(modifier = Modifier
        .fillMaxSize()){
        HorizontalPager(
            state = pagerState
        ) {index ->
            when(presentationList[index]){
                "Obliviate" -> {
                    BasePresentation(
                        backgroundColor = Color(0xff0C0810),
                        isObliviateIcon = true,
                        color = Color.LightGray,
                        imageIcon = null,
                        text = Strings.presentation
                    )
                }
                "Lufa-Lufa" -> {
                    BasePresentation(
                        backgroundColor = Color(0xff212028),
                        isObliviateIcon = false,
                        imageIcon = R.raw.lufalufa,
                        color = Color(0xffDBBC42),
                        text = Strings.lufa_lufa
                    )
                }
                "Corvinal" -> {
                    BasePresentation(
                        backgroundColor = Color(0xffBD893B),
                        isObliviateIcon = false,
                        imageIcon = R.raw.corvinal,
                        color = Color(0xff2F3D7A),
                        text = Strings.corvinal
                    )
                }
                "Grifinoria" -> {
                    BasePresentation(
                        backgroundColor = Color(0xffEEBA30),
                        isObliviateIcon = false,
                        imageIcon = R.raw.grifinoria,
                        color = Color(0xffA12A32),
                        text = Strings.grifinoria
                    )
                }
                "Sonserina" -> {
                    BasePresentation(
                        backgroundColor = Color(0xFFC0C0C0),
                        isObliviateIcon = false,
                        imageIcon = R.raw.sonserina,
                        color = Color(0xff427B52),
                        text = Strings.sonserina
                    )
                }

            }
        }
    }
}



