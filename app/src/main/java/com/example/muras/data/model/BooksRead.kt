package com.example.muras.data.model

data class BooksRead(
    val book: Int,
    val bookmarked_date: String,
    val id: Int,
    val user: Int
)

data class AddBooksRead(
    val book: Int
)