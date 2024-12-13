package com.example.movie_mobile.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun AllScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Trending Movies",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(trendingMoviesImages.size) { index ->
                Image(
                    painter = painterResource(trendingMoviesImages[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .height(300.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Trending Series",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(trendingSeriesImages.size) { index ->
                Image(
                    painter = painterResource(trendingSeriesImages[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .height(300.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Movies For You",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(trendingMoviesImages.size) { index ->
                Image(
                    painter = painterResource(trendingMoviesImages[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .height(300.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Series For You",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(trendingSeriesImages.size) { index ->
                Image(
                    painter = painterResource(trendingSeriesImages[index]),
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .height(300.dp)
                )
            }
        }
    }
}