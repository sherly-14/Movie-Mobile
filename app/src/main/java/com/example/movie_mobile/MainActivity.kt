package com.example.movie_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movie_mobile.ui.theme.MovieMobileTheme
import com.example.movie_mobile.view.AllScreen
import com.example.movie_mobile.view.HomePage
import com.example.movie_mobile.view.MoviesScreen
import com.example.movie_mobile.view.SeriesScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieMobileTheme {
                AppNavigation()
            }
        }
    }
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomePage(
                onAllClicked = { navController.navigate("all") },
                onMoviesClicked = { navController.navigate("movies") },
                onSeriesClicked = { navController.navigate("series") },
                onSearchClicked = { /* Implement Search Logic */ }
            )
        }
        composable("all") { AllScreen(navController) }
        composable("movies") { MoviesScreen(navController) }
        composable("series") { SeriesScreen(navController) }
    }
}
