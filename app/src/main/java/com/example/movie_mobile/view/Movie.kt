package com.example.movie_mobile.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.movie_mobile.R

data class Movie(
    val title: String,
    val genre: String,
    val rating: Double,
    val duration: String,
    val director: String,
    val actors: String,
    val synopsis: String,
    val imageResId: Int // Resource ID untuk gambar
)

class MovieViewModel : ViewModel() {
    private val _movies = MutableLiveData<List<Movie>>()
    val movies: LiveData<List<Movie>> get() = _movies

    init {
        // Inisialisasi daftar film
        _movies.value = listOf(
            Movie("Look Back", "Drama • Animation", 4.3, "58 mins", "Kiyotaka Oshiyama", "Yuumi Kawai • Mizuki Yoshida", "Popular, outgoing Fujino is celebrated by her classmates for her funny comics in " +
                    "the class newspaper. One day, her teacher asks her to share the space with " +
                    "Kyomoto, a truant recluse whose beautiful artwork sparks a competitive fervor " +
                    "in Fujino. What starts as jealousy transforms when Fujino realizes their shared " +
                    "passion for drawing.", R.drawable.look_back),
            // Tambahkan film lainnya jika diperlukan
        )
    }

    fun getMovieByTitle(title: String): Movie? {
        return _movies.value?.find { it.title == title }
    }
}