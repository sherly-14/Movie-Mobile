package com.example.movie_mobile.view

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movie_mobile.NavigationRow


@Composable
fun HomePage(
    onAllClicked: () -> Unit,
    onMoviesClicked: () -> Unit,
    onSeriesClicked: () -> Unit,
    onSearchClicked: () -> Unit
) {
    var selectedTab by remember { mutableStateOf("All") }

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
                    "All" -> onAllClicked()
                    "Movies" -> onMoviesClicked()
                    "Series" -> onSeriesClicked()
                }
            },
            onSearchClicked = onSearchClicked
        )

        Spacer(modifier = Modifier.height(16.dp))

        when (selectedTab) {
            "All" -> AllContent()
            "Movies" -> MoviesContent()
            "Series" -> SeriesContent()
        }
    }
}

@Composable
fun AllContent() {
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

@Composable
fun MoviesContent() {
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
}

@Composable
fun SeriesContent() {
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

@Preview
@Composable
fun HomePagePreview() {
    HomePage(
        onAllClicked = {},
        onMoviesClicked = {},
        onSeriesClicked = {},
        onSearchClicked = {}
    )
}