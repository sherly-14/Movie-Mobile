package com.example.movie_mobile.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.movie_mobile.NavigationRow


@Composable
fun AllScreen(navController: NavController)
{
    var selectedTab by remember { mutableStateOf("All") }
    val navController = rememberNavController()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // NavigationRow untuk Tab Navigasi
        NavigationRow(
            selectedTab = selectedTab,
            onTabSelected = { tab ->
                selectedTab = tab
                when (tab) {
                    "All" -> navController.navigate("all")
                    "Movies" -> navController.navigate("movies")
                    "Series" -> navController.navigate("series")
                }
            },
            onSearchClicked = { }
        )

        Spacer(modifier = Modifier.height(16.dp))

        when (selectedTab) {
            "All" -> AllContent()
            "Movies" -> MoviesContent()
            "Series" -> SeriesContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllScreenPreview() {
    val dummyController = rememberNavController()
    AllScreen(dummyController)
}