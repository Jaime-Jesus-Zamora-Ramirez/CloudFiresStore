// Generated by view binder compiler. Do not edit!
package edu.mx.unipolidgo.myfirebaseproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import edu.mx.unipolidgo.myfirebaseproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonRedirectLogin;

  @NonNull
  public final Button buttonRegister;

  @NonNull
  public final EditText editTextConfirmPassword;

  @NonNull
  public final EditText editTextPassword;

  @NonNull
  public final EditText textEmail;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button buttonRedirectLogin, @NonNull Button buttonRegister,
      @NonNull EditText editTextConfirmPassword, @NonNull EditText editTextPassword,
      @NonNull EditText textEmail) {
    this.rootView = rootView;
    this.buttonRedirectLogin = buttonRedirectLogin;
    this.buttonRegister = buttonRegister;
    this.editTextConfirmPassword = editTextConfirmPassword;
    this.editTextPassword = editTextPassword;
    this.textEmail = textEmail;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonRedirectLogin;
      Button buttonRedirectLogin = ViewBindings.findChildViewById(rootView, id);
      if (buttonRedirectLogin == null) {
        break missingId;
      }

      id = R.id.buttonRegister;
      Button buttonRegister = ViewBindings.findChildViewById(rootView, id);
      if (buttonRegister == null) {
        break missingId;
      }

      id = R.id.editTextConfirmPassword;
      EditText editTextConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextConfirmPassword == null) {
        break missingId;
      }

      id = R.id.editTextPassword;
      EditText editTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextPassword == null) {
        break missingId;
      }

      id = R.id.textEmail;
      EditText textEmail = ViewBindings.findChildViewById(rootView, id);
      if (textEmail == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, buttonRedirectLogin,
          buttonRegister, editTextConfirmPassword, editTextPassword, textEmail);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
