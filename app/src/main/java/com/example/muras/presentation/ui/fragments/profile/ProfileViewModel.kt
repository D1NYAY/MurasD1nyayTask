package com.example.muras.presentation.ui.fragments.profile

import com.example.muras.domain.module.FavoritesBooks
import com.example.muras.domain.usecase.GetFavoritesUseCase
import com.example.muras.presentation.ui.base.BaseViewModel
import com.example.muras.presentation.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val getFavoritesUseCase: GetFavoritesUseCase
) : BaseViewModel(){
private  val _getFavoritesState = MutableStateFlow<UIState<FavoritesBooks>>(UIState.Empty())
    val getFavoriteState = _getFavoritesState

    fun getFavorites(){
        getFavoritesUseCase.getFavorites().collectFlow(_getFavoritesState)
    }
}