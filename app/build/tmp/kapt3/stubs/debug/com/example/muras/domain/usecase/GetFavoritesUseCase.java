package com.example.muras.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/muras/domain/usecase/GetFavoritesUseCase;", "", "murasRepository", "Lcom/example/muras/domain/repository/MurasRepository;", "(Lcom/example/muras/domain/repository/MurasRepository;)V", "getFavorites", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/muras/domain/utils/Resource;", "Lcom/example/muras/domain/module/FavoritesBooks;", "app_debug"})
public final class GetFavoritesUseCase {
    private final com.example.muras.domain.repository.MurasRepository murasRepository = null;
    
    @javax.inject.Inject
    public GetFavoritesUseCase(@org.jetbrains.annotations.NotNull
    com.example.muras.domain.repository.MurasRepository murasRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.muras.domain.utils.Resource<com.example.muras.domain.module.FavoritesBooks>> getFavorites() {
        return null;
    }
}