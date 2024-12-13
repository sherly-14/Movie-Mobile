package com.example.movie_mobile.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.movie_mobile.R
import com.example.movie_mobile.ui.theme.MovieMobileTheme

@Composable
fun DetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.look_back),
            contentDescription = null,
            modifier = Modifier
                .width(300.dp)
                .height(424.dp)
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))

        // Judul Film
        Text(
            text = "Look Back",
            style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
        )

        Spacer(modifier = Modifier.height(4.dp))

        // GenrE
        Text(
            text = "Drama • Animation",
            style = MaterialTheme.typography.bodyMedium
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Rating dan Durasi
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "★ 4.3  |  58 mins",
                style = MaterialTheme.typography.bodyMedium
            )
        }
        Spacer(modifier = Modifier.height(4.dp))

        // Direktor
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.align(Alignment.Start)
        ) {
            Text(
                text = "Directed by",
                style = MaterialTheme.typography.bodyMedium
            )
            Spacer(modifier = Modifier.width(2.dp))
            Text(
                text = "Kiyotaka Oshiyama",
                style = MaterialTheme.typography.bodyMedium.copy(fontWeight = FontWeight.Bold)
            )
        }
        Spacer(modifier = Modifier.height(4.dp))

        // Aktor
        Text(
            text = "Yuumi Kawai • Mizuki Yoshida",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(4.dp))

        // Sinopsis
        Text(
            text = "Popular, outgoing Fujino is celebrated by her classmates for her funny comics in " +
                    "the class newspaper. One day, her teacher asks her to share the space with " +
                    "Kyomoto, a truant recluse whose beautiful artwork sparks a competitive fervor " +
                    "in Fujino. What starts as jealousy transforms when Fujino realizes their shared " +
                    "passion for drawing.",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(Alignment.Start)
        )
        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_medium)))
    }
}

@Preview(showBackground = true)
@Composable
fun DetailPreview() {
    MovieMobileTheme {
        DetailScreen()
    }
}