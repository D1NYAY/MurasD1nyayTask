// Generated by Dagger (https://dagger.dev).
package com.example.muras.presentation.ui.fragments.profile;

import com.example.muras.domain.usecase.GetFavoritesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ProfileViewModel_Factory implements Factory<ProfileViewModel> {
  private final Provider<GetFavoritesUseCase> getFavoritesUseCaseProvider;

  public ProfileViewModel_Factory(Provider<GetFavoritesUseCase> getFavoritesUseCaseProvider) {
    this.getFavoritesUseCaseProvider = getFavoritesUseCaseProvider;
  }

  @Override
  public ProfileViewModel get() {
    return newInstance(getFavoritesUseCaseProvider.get());
  }

  public static ProfileViewModel_Factory create(
      Provider<GetFavoritesUseCase> getFavoritesUseCaseProvider) {
    return new ProfileViewModel_Factory(getFavoritesUseCaseProvider);
  }

  public static ProfileViewModel newInstance(GetFavoritesUseCase getFavoritesUseCase) {
    return new ProfileViewModel(getFavoritesUseCase);
  }
}
