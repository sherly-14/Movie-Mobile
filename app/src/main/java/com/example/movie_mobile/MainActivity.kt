package com.example.movie_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movie_mobile.ui.theme.MovieMobileTheme
import com.example.movie_mobile.view.AllScreen
import com.example.movie_mobile.view.DetailScreen
import com.example.movie_mobile.view.HomePage
import com.example.movie_mobile.view.MovieViewModel
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
    val viewModel: MovieViewModel = viewModel()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomePage(
                onAllClicked = { navController.navigate("all") },
                onMoviesClicked = { navController.navigate("movies") },
                onSeriesClicked = { navController.navigate("series") },
                onSearchClicked = {  },
                navController = navController,
                viewModel = viewModel
            )
        }
        composable("all") { AllScreen(navController, viewModel) }
        composable("movies") { MoviesScreen(navController, viewModel) }
        composable("series") { SeriesScreen(navController) }
        composable("detail/{movieTitle}") { backStackEntry ->
            val movieTitle = backStackEntry.arguments?.getString("movieTitle") ?: ""
            DetailScreen(
                movieTitle = movieTitle,
                viewModel = viewModel,
                onBackClick = { navController.popBackStack() })
        }
    }
}
