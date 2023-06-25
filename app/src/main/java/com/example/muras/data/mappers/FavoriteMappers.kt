package com.example.muras.data.mappers

import com.example.muras.data.model.FavoritesBooks

fun FavoritesBooks.toFavorites() = com.example.muras.domain.module.FavoritesBooks(
    id,
    book,
    book_title,
    user
)

class FavoriteMappers {

}
