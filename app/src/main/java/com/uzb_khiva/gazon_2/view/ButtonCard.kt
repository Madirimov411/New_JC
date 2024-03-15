package com.uzb_khiva.gazon_2.view

import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uzb_khiva.gazon_2.R
import com.uzb_khiva.gazon_2.ui.theme.LightBlue

@Composable
fun ButtonCard(
    modifier: Modifier = Modifier,
    title: String? = null,
    icon: ImageVector? = null,
    @DrawableRes
    image: Int? = null,
    onClick: () -> Unit
) {

    Card(
        modifier = modifier
            .width(107.dp)
            .height(28.dp)
            .clickable(
                interactionSource = remember { MutableInteractionSource() },
                indication = null
            ) {
                onClick()
            },
        colors = CardDefaults.cardColors(
            containerColor = LightBlue
        ),
        shape = RoundedCornerShape(8.dp)
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            if (icon != null) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
            }

            if (image != null) {
                Icon(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )

            }



            if (title != null) {

                if (icon != null || image != null) {
                    Spacer(modifier = Modifier.width(5.dp))
                }

                Text(
                    text = title,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 10.sp,
                        fontWeight = FontWeight(500)
                    )
                )
            }

        }


    }

}

@Preview
@Composable
fun ButtonCardPreview() {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ButtonCard(
            title = "Add card",
            icon = Icons.Default.Add
        ) {
            Toast.makeText(context, "Add card", Toast.LENGTH_SHORT).show()
        }

        Spacer(modifier = Modifier.height(150.dp))

        ButtonCard(
            title = "Go to order"
        ) {
            Toast.makeText(context, "Go to order", Toast.LENGTH_SHORT).show()
        }

        Spacer(modifier = Modifier.height(150.dp))

        ButtonCard(
            image = R.drawable.ic_earth
        ) {
            Toast.makeText(context, "Go to order", Toast.LENGTH_SHORT).show()
        }


    }
}