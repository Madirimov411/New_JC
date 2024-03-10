package com.uzb_khiva.gazon_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uzb_khiva.gazon_2.model.Placed
import com.uzb_khiva.gazon_2.ui.theme.LightBlue
import com.uzb_khiva.gazon_2.ui.theme.LightBlue2
import com.uzb_khiva.gazon_2.ui.theme.LightGray
import com.uzb_khiva.gazon_2.util.placeds

@Composable
fun HistoryItem(
    modifier: Modifier = Modifier,
    placed: Placed,
    onClick: () -> Unit
) {


    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(64.dp)
            .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(15.dp),
                spotColor = LightGray
            )
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                onClick()
            },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(15.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                    .padding(5.dp)
            ) {

                Text(
                    text = placed.maydonNomi,
                    style = TextStyle(
                        color = LightBlue,
                        fontSize = 13.sp,
                        fontWeight = FontWeight(600)
                    )
                )

                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Icon(
                        modifier = Modifier.size(18.dp),
                        imageVector = Icons.Default.LocationOn,
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
                            //fontWeight = FontWeight(500)
                        )
                    )
                }

            }

            Text(
                text = placed.sana,
                style = TextStyle(
                    color = LightGray,
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400)
                )
            )

            Spacer(modifier = Modifier.width(15.dp))


            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "ArrowForward",
                tint = LightBlue,
                modifier = Modifier
                    .size(25.dp)
                    .clip(CircleShape)
                    .background(LightBlue2)
                    .padding(5.dp)
            )
        }

    }

}


@Preview
@Composable
private fun HistoryItemPreview() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center
    ) {
        items(placeds.size) {
            HistoryItem(
                placed = placeds[it]
            ) {
            }
        }
    }

}