package com.example.movie_mobile.view

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movie_mobile.R
import com.example.movie_mobile.ui.theme.MovieMobileTheme

@Composable
fun HomePage (
    onAllClicked: () -> Unit,
    onMoviesClicked: () -> Unit,
    onSeriesClicked: () -> Unit,
    onSearchClicked: () -> Unit
){
    Column {
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Button(onClick = onAllClicked) { Text("All") }
            Button(onClick = onMoviesClicked) { Text("Movies") }
            Button(onClick = onSeriesClicked) { Text("Series") }
            IconButton(onClick = onSearchClicked) { Icon(Icons.Default.Search, contentDescription = "Search")}
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Trending Movies",
            style = MaterialTheme.typography.headlineSmall
        )
        Row {
            Image(
                painter = painterResource(R.drawable.look_back),
                contentDescription = null,
                modifier = Modifier.width(200.dp)
            )
            Image(
                painter = painterResource(R.drawable.hq),
                contentDescription = null,
                modifier = Modifier.width(200.dp)
            )
        }

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

