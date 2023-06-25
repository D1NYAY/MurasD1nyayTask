package com.example.muras.domain.module

data class FavoritesBooks(
    val id: String,
    val book: Int,
    val book_title: String,
    val user: Int
)

data class FavoritesAdd(
    val book: Int
)