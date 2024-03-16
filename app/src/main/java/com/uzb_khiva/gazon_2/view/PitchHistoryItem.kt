package com.uzb_khiva.gazon_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uzb_khiva.gazon_2.model.Placed
import com.uzb_khiva.gazon_2.ui.theme.LightBlue
import com.uzb_khiva.gazon_2.ui.theme.LightBlue2
import com.uzb_khiva.gazon_2.ui.theme.LightGray
import com.uzb_khiva.gazon_2.util.fontGilroyLight
import com.uzb_khiva.gazon_2.util.fontGilroyMedium
import com.uzb_khiva.gazon_2.util.fontGilroySemiBold
import com.uzb_khiva.gazon_2.util.placeds

@Composable
fun PitchHistoryItem(
    modifier: Modifier = Modifier,
    placed: Placed,
    id: Int,
    onClickManage: (Int) -> Unit = {}
) {

    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(190.dp)
            .padding(start = 15.dp, end = 15.dp, top = 15.dp)
            .shadow(
                elevation = 20.dp,
                shape = RoundedCornerShape(15.dp),
                spotColor = LightGray
            ),
        colors = CardDefaults.cardColors(
            containerColor = if (id == 1) LightBlue2 else Color.White
        ),
        shape = RoundedCornerShape(15.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {

                if (id == 1) {
                    Box(
                        modifier = Modifier
                            .height(34.dp)
                            .width(117.dp)
                            .background(LightBlue)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 0.dp,
                                    topEnd = 0.dp,
                                    bottomStart = 0.dp,
                                    bottomEnd = 8.dp
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Upcoming",
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 13.sp,
                                fontFamily = fontGilroySemiBold()
                            )
                        )
                    }
                }

                Text(
                    text = placed.maydonNomi,
                    style = TextStyle(
                        color = LightBlue,
                        fontSize = 13.sp,
                        fontFamily = fontGilroySemiBold()
                    ),
                    modifier = Modifier
                        .padding(top = 15.dp, start = 15.dp)
                        .fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 15.dp),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Icon(
                        modifier = Modifier.size(15.dp),
                        imageVector = Icons.Outlined.LocationOn,
                        contentDescription = "Location_Icon",
                        tint = LightGray,
                    )

                    Text(
                        modifier = Modifier
                            .weight(1f),
                        text = placed.manzil,
                        style = TextStyle(
                            color = LightGray,
                            fontSize = 11.sp,
                            fontFamily = fontGilroyMedium()
                        )
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth(),
                    text = placed.vaqt,
                    style = TextStyle(
                        fontSize = 14.sp,
                        color = LightGray,
                        fontFamily = fontGilroyLight()
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    modifier = Modifier
                        .padding(start = 15.dp)
                        .fillMaxWidth(),
                    text = "${placed.narx}/hr",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = fontGilroySemiBold(),
                        color = LightGray
                    )
                )

                if (id != 1) {

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp),
                        text = "Write review",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = fontGilroySemiBold(),
                            color = LightGray
                        )
                    )

                }


            }

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    modifier = Modifier.align(Alignment.End),
                    text = placed.sana,
                    style = TextStyle(
                        color = LightGray,
                        fontSize = 10.sp,
                        fontFamily = fontGilroyLight()
                    )
                )

                if (id == 1) {

                    ButtonCard(
                        modifier = Modifier.align(Alignment.End),
                        title = "Manage",
                        textStyle = TextStyle(
                            fontSize = 13.sp,
                            color = Color.White,
                            fontFamily = fontGilroySemiBold()
                        )
                    ) {
                        //TODO
                    }

                } else {

                    ButtonCard(
                        modifier = Modifier.align(Alignment.End),
                        title = "More information",
                        textStyle = TextStyle(
                            fontSize = 11.sp,
                            color = Color.White,
                            fontFamily = fontGilroyMedium()
                        )
                    ) {
                        //TODO
                    }


                }


            }

        }

    }

}

@Preview
@Composable
fun PitchHistoryItemPreview() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        LazyColumn {
            items(placeds) { placed ->
                PitchHistoryItem(placed = placed, id = placed.id)
            }
        }

    }

}
