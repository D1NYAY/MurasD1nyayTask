package com.example.muras.presentation.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\n0\tH\u0004\u00a8\u0006\u000b"}, d2 = {"Lcom/example/muras/presentation/ui/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "collectFlow", "", "T", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/muras/domain/utils/Resource;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/muras/presentation/utils/UIState;", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    
    public BaseViewModel() {
        super();
    }
    
    protected final <T extends java.lang.Object>void collectFlow(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends com.example.muras.domain.utils.Resource<T>> $this$collectFlow, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.MutableStateFlow<com.example.muras.presentation.utils.UIState<T>> _state) {
    }
}