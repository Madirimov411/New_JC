package com.uzb_khiva.gazon_2.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uzb_khiva.gazon_2.R
import com.uzb_khiva.gazon_2.ui.theme.LightBlue
import com.uzb_khiva.gazon_2.ui.theme.LightBlue2
import com.uzb_khiva.gazon_2.ui.theme.LightGray
import com.uzb_khiva.gazon_2.ui.theme.LightGreen
import com.uzb_khiva.gazon_2.ui.theme.LightGreen2
import com.uzb_khiva.gazon_2.ui.theme.LightRed
import com.uzb_khiva.gazon_2.ui.theme.LightRed2
import com.uzb_khiva.gazon_2.util.cards
import com.uzb_khiva.gazon_2.util.placeds
import com.uzb_khiva.gazon_2.view.CardNumberView
import com.uzb_khiva.gazon_2.view.HistoryItem
import com.uzb_khiva.gazon_2.view.ProfileItemView
import com.uzb_khiva.gazon_2.view.SavedPlacesItem


@Composable
fun ProfileScreen() {

    val context= LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F5F8))
    ) {

        ProfileItemView(
            modifier = Modifier.padding(horizontal = 15.dp),
            title = "Saved Placed",
            image = R.drawable.ic_bookmark,
            imageBackColor = LightBlue2,
            imageTintColor = LightBlue
        ) {
            Toast.makeText(context, "Saved Placed see all", Toast.LENGTH_SHORT).show()
        }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            items(4) { index ->
                SavedPlacesItem(
                    modifier = Modifier.padding(end = if (index == placeds.size - 1) 15.dp else 0.dp),
                    placed = placeds[index]
                ) {
                    //TODO SavedPlacesItem clicked
                    Toast.makeText(context, "Saved placed Item $index", Toast.LENGTH_SHORT).show()
                }
            }
        }

        ProfileItemView(
            modifier = Modifier.padding(horizontal = 15.dp),
            title = "History",
            image = R.drawable.ic_history,
            imageBackColor = LightGreen2,
            imageTintColor = LightGreen
        ) {
            Toast.makeText(context, "History see all", Toast.LENGTH_SHORT).show()
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            items(3) {
                HistoryItem(placed = placeds[it]) {
                    //TODO HistoryItem clicked
                    Toast.makeText(context, "History Item $it", Toast.LENGTH_SHORT).show()
                }
            }
        }

        ProfileItemView(
            modifier = Modifier.padding(horizontal = 15.dp),
            title = "History",
            image = R.drawable.ic_card,
            imageBackColor = LightRed2,
            imageTintColor = LightRed
        ) {
            Toast.makeText(context, "Card see all", Toast.LENGTH_SHORT).show()
        }

        CardNumberView(
            card = cards[0],
            onItemClick = {
                //TODO
            },
            onDeleteClick = {
                Toast.makeText(context, "Card Delete Click", Toast.LENGTH_SHORT).show()
            }
        )

    }

}

@Preview
@Composable
private fun ProfileScreenPreview() {
    ProfileScreen()
}