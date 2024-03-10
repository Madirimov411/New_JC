package com.uzb_khiva.gazon_2.view

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
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

@Composable
fun ProfileItemView(
    modifier: Modifier = Modifier,
    title: String,
    @DrawableRes
    image: Int,
    imageBackColor: Color,
    imageTintColor: Color,
    onItemClick: () -> Unit
) {

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = image),
            contentDescription = "image",
            colorFilter = ColorFilter.tint(imageTintColor),
            modifier = Modifier
                .size(25.dp)
                .clip(CircleShape)
                .background(imageBackColor)
                .padding(5.dp)
        )

        /*
        Icon(
            painter = painterResource(id = image),
            contentDescription = "ArrowForward",
            tint = imageTintColor,
            modifier = Modifier
                .size(25.dp)
                .clip(CircleShape)
                .background(imageBackColor)
                .padding(5.dp)
        )
        */
        Spacer(modifier = Modifier.width(10.dp))

        Text(
            modifier = Modifier.weight(1f),
            text = title,
            style = TextStyle(
                fontWeight = FontWeight(500),
                color = LightGray,
                fontSize = 14.sp
            )
        )

        Text(
            text = "See all",
            style = TextStyle(
                fontWeight = FontWeight(400),
                color = LightBlue,
                fontSize = 10.sp
            ),
            modifier = Modifier
                .clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null
                ) {
                    onItemClick()
                }
        )

    }


}

@Preview
@Composable
private fun ProfileItemViewPreview() {
    ProfileItemView(
        title = "Saved Placed",
        image = R.drawable.ic_bookmark,
        imageBackColor = LightBlue2,
        imageTintColor = LightBlue
    ) {

    }
}