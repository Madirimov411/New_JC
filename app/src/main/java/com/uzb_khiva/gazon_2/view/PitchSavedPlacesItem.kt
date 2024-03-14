@file:OptIn(ExperimentalFoundationApi::class)

package com.uzb_khiva.gazon_2.view

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.uzb_khiva.gazon_2.R
import com.uzb_khiva.gazon_2.model.Placed
import com.uzb_khiva.gazon_2.ui.theme.LightGray
import com.uzb_khiva.gazon_2.util.placeds
import kotlinx.coroutines.launch


@Composable
fun PitchSavedPlacesItem(
    modifier: Modifier = Modifier,
    placed: Placed,
    onBookNowClick: (Int) -> Unit = {},
    onLocationClick: (Int) -> Unit = {}
) {

    val context = LocalContext.current

    val pageCount = placed.imageList.size
    val pagerState = rememberPagerState(pageCount = { placed.imageList.size })
    val pagerIndex = remember {
        mutableIntStateOf(pagerState.currentPage)
    }

    val scope = rememberCoroutineScope()

    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(192.dp)
            .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(15.dp),
                spotColor = LightGray
            ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(15.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Box(
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxSize()
                    .weight(1f),

                ) {

                HorizontalPager(
                    state = pagerState,
                    userScrollEnabled = false
                ) { index ->

                    AsyncImage(
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(RoundedCornerShape(15.dp)),
                        model = ImageRequest.Builder(context)
                            .data(placed.imageList[index])
                            .crossfade(true)
                            .build(),
                        contentDescription = null,
                        placeholder = painterResource(id = R.drawable.msi),
                        contentScale = ContentScale.Crop
                    )

                }

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 2.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Icon(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .background(
                                if (pagerIndex.intValue == 0) Color.Transparent else Color(
                                    0x4DFFFFFF
                                )
                            )
                            .padding(5.dp)
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null
                            ) {
                                if (pagerIndex.intValue != 0) {
                                    pagerIndex.intValue -= 1
                                    scope.launch {
                                        pagerState.animateScrollToPage(page = pagerIndex.intValue)
                                    }
                                }
                            },
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = null,
                        tint = if (pagerIndex.intValue == 0) Color.Transparent else Color.White,
                    )

                    Icon(
                        modifier = Modifier
                            .size(30.dp)
                            .clip(RoundedCornerShape(15.dp))
                            .background(
                                if (pagerIndex.intValue == pageCount - 1) Color.Transparent else Color(
                                    0x4DFFFFFF
                                )
                            )
                            .padding(5.dp)
                            .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = null
                            ) {
                                if (pagerIndex.intValue != pageCount - 1) {
                                    pagerIndex.intValue += 1
                                    scope.launch {
                                        pagerState.animateScrollToPage(page = pagerIndex.intValue)
                                    }
                                }
                            },
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null,
                        tint = if (pagerIndex.intValue == pageCount - 1) Color.Transparent else Color.White,
                    )


                }

            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                //TODO
            }

        }

    }


}

@Preview
@Composable
private fun PitchSavedPlacesItemPreview() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        LazyColumn {
            items(placeds) { placed ->
                PitchSavedPlacesItem(placed = placed)
            }
        }

    }

}