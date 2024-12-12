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
import com.example.movie_mobile.ui.theme.MovieMobileTheme
import com.example.movie_mobile.view.HomePage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieMobileTheme {
                HomePage(
                    onAllClicked = { /* TODO: Implement All Clicked */ },
                    onMoviesClicked = { /* TODO: Implement Movies Clicked */ },
                    onSeriesClicked = { /* TODO: Implement Series Clicked */ },
                    onSearchClicked = { /* TODO: Implement Search Clicked */ }
                )
                }
            }
        }
    }
