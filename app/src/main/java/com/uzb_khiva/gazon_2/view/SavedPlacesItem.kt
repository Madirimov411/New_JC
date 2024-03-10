package com.uzb_khiva.gazon_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.uzb_khiva.gazon_2.R
import com.uzb_khiva.gazon_2.model.Placed
import com.uzb_khiva.gazon_2.ui.theme.LightBlue
import com.uzb_khiva.gazon_2.ui.theme.LightGray
import com.uzb_khiva.gazon_2.util.placeds

@Composable
fun SavedPlacesItem(
    modifier: Modifier = Modifier,
    placed: Placed,
    onItemClicked: (Placed) -> Unit
) {

    val context = LocalContext.current

    Card(
        modifier = modifier
            .width(142.dp)
            .height(151.dp)
            .padding(start = 15.dp)
            .shadow(
                elevation = 5.dp,
                shape = RoundedCornerShape(8.dp),
                spotColor = LightGray
            )
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                onItemClicked(placed)
            },
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        shape = RoundedCornerShape(15.dp)
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            AsyncImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
                    .clip(RoundedCornerShape(5.dp)),
                model = ImageRequest.Builder(context)
                    .data(placed.imageUrl)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(id = R.drawable.ic_downloading),
                contentDescription = "Gazon",
                contentScale = ContentScale.Crop,
            )

            Spacer(modifier = Modifier.height(7.dp))

            Text(
                modifier = Modifier
                    .padding(horizontal = 10.dp),
                text = placed.maydonNomi,
                style = TextStyle(
                    color = LightGray,
                    fontSize = 11.sp,
                    fontWeight = FontWeight(600)
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {

                Icon(
                    modifier = Modifier.size(18.dp),
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "Location_Icon",
                    tint = LightBlue,
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

    }
}

@Preview
@Composable
private fun SavedPlacesItemPreview() {
    LazyRow(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(placeds.size) {
            SavedPlacesItem(
                modifier = Modifier.padding(end = if (it == placeds.size - 1) 15.dp else 0.dp),
                placed = placeds[it]
            ) {
            }
        }
    }
}