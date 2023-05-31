package com.example.muras.data.model

data class FavoritesBooks(
    val book: Int,
    val book_title: String,
    val user: Int
)

data class FavoritesAdd(
    val book: Int
)