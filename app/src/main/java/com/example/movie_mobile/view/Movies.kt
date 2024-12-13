package com.example.movie_mobile.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.movie_mobile.NavigationRow

@Composable
fun MoviesScreen(navController: NavController, viewModel: MovieViewModel) {
    var selectedTab by remember { mutableStateOf("Movies") }
    val movies = viewModel.movies.observeAsState(listOf())
    val navController = rememberNavController()

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
            "Movies" -> MoviesContent(navController, movies.value)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MoviesScreenPreview() {
    val dummyController = rememberNavController()
    MoviesScreen(dummyController, viewModel = MovieViewModel())
}
