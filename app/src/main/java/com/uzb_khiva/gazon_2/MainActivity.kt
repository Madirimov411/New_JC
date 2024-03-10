package com.uzb_khiva.gazon_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.uzb_khiva.gazon_2.screen.ProfileScreen
import com.uzb_khiva.gazon_2.view.SavedPlacesItem
import com.uzb_khiva.gazon_2.ui.theme.Gazon_2Theme
import com.uzb_khiva.gazon_2.util.placeds

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Gazon_2Theme {
                ProfileScreen()
            }
        }
    }
}
