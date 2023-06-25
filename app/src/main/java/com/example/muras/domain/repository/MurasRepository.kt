package com.example.muras.domain.repository

import com.example.muras.domain.module.FavoritesBooks
import com.example.muras.domain.utils.Resource
import kotlinx.coroutines.flow.Flow

interface MurasRepository {
    fun getFavorites() : Flow<Resource<FavoritesBooks>>
}