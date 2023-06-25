package com.example.muras.di

import com.example.muras.data.remote.MurasAPI
import com.example.muras.data.repostory.MurasRepositoryImpl
import com.example.muras.domain.repository.MurasRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteAppModule {
    @Singleton
        @Provides
        fun provideRetrofit (okHttpClient: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://kitepkana1.python.anywhere.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build()

    }
    @Singleton
    @Provides
    fun provideMurasRepository(
        apiService: MurasAPI
    ) : MurasRepository = MurasRepositoryImpl(apiService)
    @Singleton
    @Provides
    fun provideApiService(
        retrofit: Retrofit
    ): MurasAPI = retrofit.create(MurasAPI::class.java)
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val interceptor =  HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder()
            .writeTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .connectTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(interceptor)
            .build()
    }
}