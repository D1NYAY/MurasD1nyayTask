package com.example.muras.presentation.ui.fragments.profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/muras/presentation/ui/fragments/profile/ProfileViewModel;", "Lcom/example/muras/presentation/ui/base/BaseViewModel;", "getFavoritesUseCase", "Lcom/example/muras/domain/usecase/GetFavoritesUseCase;", "(Lcom/example/muras/domain/usecase/GetFavoritesUseCase;)V", "_getFavoritesState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/muras/presentation/utils/UIState;", "Lcom/example/muras/domain/module/FavoritesBooks;", "getFavoriteState", "getGetFavoriteState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "getFavorites", "", "app_debug"})
public final class ProfileViewModel extends com.example.muras.presentation.ui.base.BaseViewModel {
    private final com.example.muras.domain.usecase.GetFavoritesUseCase getFavoritesUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.muras.presentation.utils.UIState<com.example.muras.domain.module.FavoritesBooks>> _getFavoritesState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.muras.presentation.utils.UIState<com.example.muras.domain.module.FavoritesBooks>> getFavoriteState = null;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.example.muras.domain.usecase.GetFavoritesUseCase getFavoritesUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<com.example.muras.presentation.utils.UIState<com.example.muras.domain.module.FavoritesBooks>> getGetFavoriteState() {
        return null;
    }
    
    public final void getFavorites() {
    }
}