// Generated by Dagger (https://dagger.dev).
package com.example.muras.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.OkHttpClient;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteAppModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  @Override
  public OkHttpClient get() {
    return provideOkHttpClient();
  }

  public static NoteAppModule_ProvideOkHttpClientFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static OkHttpClient provideOkHttpClient() {
    return Preconditions.checkNotNullFromProvides(NoteAppModule.INSTANCE.provideOkHttpClient());
  }

  private static final class InstanceHolder {
    private static final NoteAppModule_ProvideOkHttpClientFactory INSTANCE = new NoteAppModule_ProvideOkHttpClientFactory();
  }
}
