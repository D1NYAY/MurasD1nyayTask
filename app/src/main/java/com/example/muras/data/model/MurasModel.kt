package com.example.muras.data.model


data class MurasModel(
    val authors: List<Author>,
    val books: List<Book>,
    val genres: List<Genre>
)

data class ListBooks(
    val cover: String,
    val id: Int,
    val middle_star: Int,
    val title: String,
    val url: String
)

data class DetailBook(
    val author: Int,
    val author_name: String,
    val cover: String,
    val `file`: String,
    val genre: List<FiltrationGenres>,
    val id: Int,
    val middle_star: Int,
    val pages: Int,
    val reviews: List<Review>,
    val summary: String,
    val title: String
)

data class Review(
    val book: Int,
    val created_date: String,
    val get_book: String,
    val get_user: String,
    val id: Int,
    val text: String,
    val updated_date: String,
    val user: Int
)

data class Genre(
    val genre_name: String,
    val id: Int,
    val url: String
)

data class Book(
    val id: Int,
    val title: String,
    val url: String
)
