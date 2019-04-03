package com.example.android.guesstheword.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class GameFragmentBinding extends ViewDataBinding {
  @NonNull
  public final Button correctButton;

  @NonNull
  public final ConstraintLayout gameLayout;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final TextView scoreText;

  @NonNull
  public final Button skipButton;

  @NonNull
  public final TextView timerText;

  @NonNull
  public final TextView wordIsText;

  @NonNull
  public final TextView wordText;

  protected GameFragmentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button correctButton, ConstraintLayout gameLayout, Guideline guideline,
      TextView scoreText, Button skipButton, TextView timerText, TextView wordIsText,
      TextView wordText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.correctButton = correctButton;
    this.gameLayout = gameLayout;
    this.guideline = guideline;
    this.scoreText = scoreText;
    this.skipButton = skipButton;
    this.timerText = timerText;
    this.wordIsText = wordIsText;
    this.wordText = wordText;
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<GameFragmentBinding>inflate(inflater, com.example.android.guesstheword.R.layout.game_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static GameFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<GameFragmentBinding>inflate(inflater, com.example.android.guesstheword.R.layout.game_fragment, null, false, component);
  }

  public static GameFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static GameFragmentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (GameFragmentBinding)bind(component, view, com.example.android.guesstheword.R.layout.game_fragment);
  }
}
