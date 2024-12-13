package com.example.movie_mobile.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movie_mobile.NavigationRow

@Composable
fun SeriesScreen( ) {
    var selectedTab by remember { mutableStateOf("Series") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Navigasi antar tab Series
        NavigationRow(
            selectedTab = selectedTab,
            onTabSelected = { tab ->
                selectedTab = tab
            },
            onSearchClicked = { }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Konten sesuai tab yang dipilih
        when (selectedTab) {
            "Series" -> SeriesContent() // Menggunakan fungsi MoviesContent dari HomePage
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SeriesScreenPreview(){
    SeriesScreen()
}