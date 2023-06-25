package com.example.muras.domain.usecase

import com.example.muras.domain.repository.MurasRepository
import javax.inject.Inject

class GetFavoritesUseCase
@Inject constructor(
    private val murasRepository: MurasRepository)

{

    fun getFavorites() = murasRepository.getFavorites()



}
