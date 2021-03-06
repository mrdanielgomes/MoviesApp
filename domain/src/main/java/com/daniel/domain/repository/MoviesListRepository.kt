package com.daniel.domain.repository

import com.daniel.domain.entity.Movie
import kotlinx.coroutines.flow.Flow

interface MoviesListRepository {
    fun getTopRatedMovies(page: Int, language: String): Flow<List<Movie>>
}