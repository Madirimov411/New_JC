package com.uzb_khiva.gazon_2.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
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
import com.uzb_khiva.gazon_2.model.Card
import com.uzb_khiva.gazon_2.ui.theme.LightBlue
import com.uzb_khiva.gazon_2.ui.theme.LightBlue2
import com.uzb_khiva.gazon_2.ui.theme.LightGray
import com.uzb_khiva.gazon_2.ui.theme.LightRed
import com.uzb_khiva.gazon_2.util.cardNumber
import com.uzb_khiva.gazon_2.util.cards

@Composable
fun CardNumberView(
    modifier: Modifier = Modifier,
    card: Card,
    onDeleteClick: () -> Unit = {},
    onItemClick: () -> Unit = {}
) {

    val context = LocalContext.current

    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(84.dp)
            .padding(start = 15.dp, end = 15.dp, bottom = 15.dp)
//            .clickable(
//                interactionSource = remember { MutableInteractionSource() },
//                indication = null
//            ) {
//                onItemClick()
//            }
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
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            AsyncImage(
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(5.dp)),
                model = ImageRequest.Builder(context)
                    .data(card.imageUrl)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(id = R.drawable.ic_downloading),
                contentDescription = "Gazon",
                contentScale = ContentScale.Crop,
            )

            Spacer(modifier = Modifier.width(10.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp)
                    .weight(1f),
                verticalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = card.bank,
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight(500),
                        color = LightGray
                    )
                )

                Text(
                    text = cardNumber(card.number),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight(400),
                        color = LightGray
                    )
                )

            }

            Column(
                modifier = Modifier.fillMaxHeight()
            ) {
                Icon(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .size(20.dp),
                    imageVector = Icons.Default.Star,
                    contentDescription = "Star",
                    tint = LightGray
                )
            }

            Spacer(modifier = Modifier.width(12.dp))

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(0.5.dp)
                    .background(LightGray)
            )

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(64.dp)
                    .clickable(
                        interactionSource = remember { MutableInteractionSource() },
                        indication = null
                    ) {
                        onDeleteClick()
                    },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Icon(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .size(20.dp),
                    painter = painterResource(id = R.drawable.ic_delete),
                    contentDescription = "Location",
                    tint = LightRed
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Delete",
                    style = TextStyle(
                        fontSize = 10.sp,
                        fontWeight = FontWeight(500),
                        color = LightRed
                    )
                )
            }

        }

    }

}

@Preview
@Composable
private fun CardNumberViewPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center
    ) {

        CardNumberView(
            modifier = Modifier,
            card = cards[0]
        )

    }
}