package com.example.muras.data.model

data class AuthorBook(
    val cover: String,
    val id: Int,
    val title: String,
    val url: String
)

data class DetailAuthorModel(
    val author_books: List<AuthorBook>,
    val fullname: String,
    val id: Int
)

data class Author(
    val fullname: String,
    val id: Int,
    val url: String
)