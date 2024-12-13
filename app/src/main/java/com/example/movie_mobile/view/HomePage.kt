package com.example.movie_mobile.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.movie_mobile.NavigationRow


@Composable
fun HomePage(
    navController: NavHostController,
    viewModel: MovieViewModel,
    onAllClicked: () -> Unit,
    onMoviesClicked: () -> Unit,
    onSeriesClicked: () -> Unit,
    onSearchClicked: () -> Unit
) {
    val movies = viewModel.movies.observeAsState(listOf())
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
            "All" -> AllContent(navController, movies.value)
            "Movies" -> MoviesContent(navController, movies.value)
            "Series" -> SeriesContent(navController)
        }
    }
}

@Composable
fun AllContent(navController: NavHostController, movies: List<Movie>) {
    // Konten untuk semua film dan serial
    Text(
        text = "Continue Watching",
        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
    )
    LazyRow(
        contentPadding = PaddingValues(horizontal = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(movies) { movie ->
            Image(
                painter = painterResource(movie.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .width(200.dp)
                    .height(300.dp)
                    .clickable {
                        navController.navigate("detail/${movie.title}") // Navigasi ke DetailScreen
                    }
            )
        }
    }

    Spacer(modifier = Modifier.height(16.dp))

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
fun MoviesContent(navController: NavHostController, movies: List<Movie>) {
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
fun SeriesContent(navController: NavController) {
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


@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    val navController = rememberNavController()
    HomePage(
        navController = navController,
        viewModel = MovieViewModel(),
        onAllClicked = {},
        onMoviesClicked = {},
        onSeriesClicked = {},
        onSearchClicked = {}
    )
}