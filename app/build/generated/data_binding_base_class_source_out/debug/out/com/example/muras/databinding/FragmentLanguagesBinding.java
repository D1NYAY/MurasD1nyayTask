// Generated by view binder compiler. Do not edit!
package com.example.muras.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.muras.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentLanguagesBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  private FragmentLanguagesBinding(@NonNull ConstraintLayout rootView) {
    this.rootView = rootView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentLanguagesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentLanguagesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_languages, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentLanguagesBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    return new FragmentLanguagesBinding((ConstraintLayout) rootView);
  }
}
