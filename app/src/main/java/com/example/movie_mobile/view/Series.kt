package com.example.movie_mobile.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.movie_mobile.NavigationRow

@Composable
fun SeriesScreen(navController: NavController) {
    var selectedTab by remember { mutableStateOf("Series") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // NavigationRow untuk berpindah tab
        NavigationRow(
            selectedTab = selectedTab,
            onTabSelected = { tab ->
                if (tab != selectedTab) {
                    selectedTab = tab
                    when (tab) {
                        "All" -> navController.navigate("all")
                        "Movies" -> navController.navigate("movies")
                        "Series" -> navController.navigate("series")
                    }
                }
            },
            onSearchClicked = { /* Implement search logic */ }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Konten sesuai tab yang dipilih
        when (selectedTab) {
            "Series" -> SeriesContent(navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SeriesScreenPreview() {
    val dummyController = rememberNavController()
    SeriesScreen(dummyController)
}
