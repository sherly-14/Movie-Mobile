package com.example.movie_mobile.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen(movieTitle: String, viewModel: MovieViewModel, onBackClick: () -> Unit) {
    val movie = viewModel.getMovieByTitle(movieTitle)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        movie?.let {
            Image(
                painter = painterResource(it.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .width(300.dp)
                    .height(424.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Text(text = it.title, style = MaterialTheme.typography.headlineSmall)
            Text(text = it.genre, style = MaterialTheme.typography.bodyMedium)
            Text(text = "★ ${it.rating} | ${it.duration}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Directed by: ${it.director}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Starring: ${it.actors}", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = it.synopsis, style = MaterialTheme.typography.bodyMedium)
        } ?: run {
            Text(text = "Movie not found", style = MaterialTheme.typography.bodyMedium)
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onBackClick) {
            Text("Back")
        }
    }
}
