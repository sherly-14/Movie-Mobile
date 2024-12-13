package com.example.movie_mobile

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NavigationRow(
    selectedTab: String,
    onTabSelected: (String) -> Unit,
    onSearchClicked: () -> Unit
) {
    val tabs = listOf("All", "Movies", "Series")

    Row(modifier = Modifier.fillMaxWidth()) {
        tabs.forEach { tab ->
            Button(
                onClick = { onTabSelected(tab) },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (selectedTab == tab) Color(0xFFA70000) else Color.Gray
                ),
                modifier = Modifier.padding(end = 8.dp)
            ) {
                Text(tab)
            }
        }

        IconButton(onClick = onSearchClicked) {
            Icon(Icons.Default.Search, contentDescription = "Search")
        }
    }
}


@Preview
@Composable
fun PreviewNavigationRow() {
    NavigationRow(
        selectedTab = "All",
        onTabSelected = {},  // Callback kosong untuk preview
        onSearchClicked = {} // Callback kosong untuk preview
    )
}