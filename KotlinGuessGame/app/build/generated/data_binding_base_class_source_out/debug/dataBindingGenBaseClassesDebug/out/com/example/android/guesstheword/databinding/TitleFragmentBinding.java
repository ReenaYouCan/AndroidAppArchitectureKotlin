package com.example.android.guesstheword.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class TitleFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView getReadyText;

  @NonNull
  public final Button playGameButton;

  @NonNull
  public final ConstraintLayout titleLayout;

  @NonNull
  public final TextView titleText;

  protected TitleFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView getReadyText, Button playGameButton,
      ConstraintLayout titleLayout, TextView titleText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.getReadyText = getReadyText;
    this.playGameButton = playGameButton;
    this.titleLayout = titleLayout;
    this.titleText = titleText;
  }

  @NonNull
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<TitleFragmentBinding>inflate(inflater, com.example.android.guesstheword.R.layout.title_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static TitleFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<TitleFragmentBinding>inflate(inflater, com.example.android.guesstheword.R.layout.title_fragment, null, false, component);
  }

  public static TitleFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static TitleFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (TitleFragmentBinding)bind(component, view, com.example.android.guesstheword.R.layout.title_fragment);
  }
}
