// Generated by Dagger (https://dagger.dev).
package com.example.muras.di;

import com.example.muras.data.remote.MurasAPI;
import com.example.muras.domain.repository.MurasRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteAppModule_ProvideMurasRepositoryFactory implements Factory<MurasRepository> {
  private final Provider<MurasAPI> apiServiceProvider;

  public NoteAppModule_ProvideMurasRepositoryFactory(Provider<MurasAPI> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public MurasRepository get() {
    return provideMurasRepository(apiServiceProvider.get());
  }

  public static NoteAppModule_ProvideMurasRepositoryFactory create(
      Provider<MurasAPI> apiServiceProvider) {
    return new NoteAppModule_ProvideMurasRepositoryFactory(apiServiceProvider);
  }

  public static MurasRepository provideMurasRepository(MurasAPI apiService) {
    return Preconditions.checkNotNullFromProvides(NoteAppModule.INSTANCE.provideMurasRepository(apiService));
  }
}