package com.example.muras.data.remote

import com.example.muras.data.model.FavoritesBooks
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MurasAPI {
    @GET("favorite")
    suspend fun getFavorites(
       /* @Query("id") id : Int,
        @Query("book_title") book_title : String,
        @Query("book_cover") book_cover : String,*/
    ) : Response<FavoritesBooks>

}
