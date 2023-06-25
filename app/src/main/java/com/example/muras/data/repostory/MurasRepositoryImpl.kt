package com.example.muras.data.repostory

import com.example.muras.data.base.BaseRepository
import com.example.muras.data.mappers.toFavorites
import com.example.muras.data.remote.MurasAPI
import com.example.muras.domain.module.FavoritesBooks
import com.example.muras.domain.repository.MurasRepository
import com.example.muras.domain.utils.Resource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MurasRepositoryImpl @Inject constructor(
    private val murasAPI: MurasAPI
) : BaseRepository() , MurasRepository {
    override fun getFavorites() = doRequest {
        murasAPI.getFavorites().body()!!.toFavorites() }


}