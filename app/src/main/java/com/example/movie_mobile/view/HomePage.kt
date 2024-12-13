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
        Spacer(modifier = Modifier.height(16.dp))

        // Row untuk Button navigasi
        Row {
            Button(
                onClick = {
                    selectedTab = "All"
                    onAllClicked()  // Mengaktifkan callback untuk All
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA70000))
            ) {
                Text("All")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    selectedTab = "Movies"
                    onMoviesClicked()  // Mengaktifkan callback untuk Movies
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA70000))
            ) {
                Text("Movies")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(
                onClick = {
                    selectedTab = "Series"
                    onSeriesClicked()  // Mengaktifkan callback untuk Series
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFA70000))
            ) {
                Text("Series")
            }
            Spacer(modifier = Modifier.width(8.dp))
            IconButton(onClick = onSearchClicked) {
                Icon(Icons.Default.Search, contentDescription = "Search")
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

    }
}


@Composable
fun SelectQuantityButton(
    @StringRes labelResourceId: Int,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier.widthIn(min = 250.dp)
    ) {
        Text(stringResource(labelResourceId))
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