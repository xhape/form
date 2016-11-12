package xyz.xhape.form.widget.validator;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import xyz.xhape.form.model.Validate;

/**
 * Validator for text type widgets.
 *
 * Created by ajavonitalla on 11/12/2016.
 */

public class TextWidgetValidator implements WidgetValidator<String> {

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

  public TextWidgetValidator(@Nullable Integer minLength, @Nullable Integer maxLength) {
    this.minLength = minLength;
    this.maxLength = maxLength;
  }

  @Override
  public ValidationResult validate(String value) {
    if (this.minLength != null && (TextUtils.isEmpty(value) || value.length() < this.minLength)) {
      return new ValidationResult(false, "Minimum length is " + this.minLength, "below_min_length");
    }

    if (this.maxLength != null && value.length() > this.maxLength) {
      return new ValidationResult(false, "Maximum length is " + this.minLength, "above_max_length");
    }

    return ValidationResult.SUCCESS;
  }
}
