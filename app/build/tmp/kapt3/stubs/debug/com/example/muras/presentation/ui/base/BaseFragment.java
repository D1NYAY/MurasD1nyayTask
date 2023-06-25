package com.example.muras.presentation.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002Jr\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00040\u000b2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u0011H\u0005\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\u000bH\u0004\u00a8\u0006\u0012"}, d2 = {"Lcom/example/muras/presentation/ui/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "collectState", "", "T", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/example/muras/presentation/utils/UIState;", "onLoading", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "message", "onSuccess", "data", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    
    public BaseFragment() {
        super();
    }
    
    protected final <T extends java.lang.Object>void collectState(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.StateFlow<? extends com.example.muras.presentation.utils.UIState<T>> $this$collectState, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onLoading, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onSuccess) {
    }
}