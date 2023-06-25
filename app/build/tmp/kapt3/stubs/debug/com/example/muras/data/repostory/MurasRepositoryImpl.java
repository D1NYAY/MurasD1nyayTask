package com.example.muras.data.repostory;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/muras/data/repostory/MurasRepositoryImpl;", "Lcom/example/muras/data/base/BaseRepository;", "Lcom/example/muras/domain/repository/MurasRepository;", "murasAPI", "Lcom/example/muras/data/remote/MurasAPI;", "(Lcom/example/muras/data/remote/MurasAPI;)V", "getFavorites", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/muras/domain/utils/Resource;", "Lcom/example/muras/domain/module/FavoritesBooks;", "app_debug"})
public final class MurasRepositoryImpl extends com.example.muras.data.base.BaseRepository implements com.example.muras.domain.repository.MurasRepository {
    private final com.example.muras.data.remote.MurasAPI murasAPI = null;
    
    @javax.inject.Inject
    public MurasRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.muras.data.remote.MurasAPI murasAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.muras.domain.utils.Resource<com.example.muras.domain.module.FavoritesBooks>> getFavorites() {
        return null;
    }
}