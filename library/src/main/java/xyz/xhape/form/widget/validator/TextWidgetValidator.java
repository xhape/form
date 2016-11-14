package xyz.xhape.form.widget.validator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import xyz.xhape.form.model.Validate;

/**
 * Validator for text type widgets.
 * TODO i18n
 * Created by ajavonitalla on 11/12/2016.
 */

public class TextWidgetValidator implements WidgetValidator<String>, TextWatcher {

  @NonNull
  private TextInputLayout layout;

  /**
   * The minimum length requirement this field must meet before the form can be submitted.
   * Using Object instead of the primitive so we know it's actually set. 0 is a valid value.
   *
   * This is checked regardless if the field is {@link Validate#required}.
   */
  @Nullable
  private Integer minLength;

  /**
   * The maximum length requirement this field must meet before the form can be submitted.
   * Using Object instead of the primitive so we know it's actually set.
   * 0 is a valid value.
   *
   * This is checked regardless if the field is {@link Validate#required}.
   */
  @Nullable
  private Integer maxLength;

  public TextWidgetValidator(@NonNull TextInputLayout layout, @Nullable Integer minLength, @Nullable Integer maxLength) {
    this.layout = layout;
    this.minLength = minLength;
    this.maxLength = maxLength;
  }

  @Override
  public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

  }

  @Override
  public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

  }

  @Override
  public void afterTextChanged(Editable editable) {
    validate(editable.toString());
  }

  @Override
  public void validate(String value) {
    if (this.minLength != null && (TextUtils.isEmpty(value) || value.length() < this.minLength)) {
      layout.setErrorEnabled(true);
      layout.setError("Min length is " + this.minLength);
    }

    if (this.maxLength != null && value.length() > this.maxLength) {
      layout.setErrorEnabled(true);
      layout.setError("Maximum length is " + this.minLength);
    }
  }
}
