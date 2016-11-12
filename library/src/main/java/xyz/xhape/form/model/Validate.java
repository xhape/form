package xyz.xhape.form.model;

import android.support.annotation.Nullable;

/**
 * Validation performed on a {@link Component}
 *
 * Created by ajavonitalla on 11/12/2016.
 */
public class Validate {

  /**
   * A required field must be filled in before the form can be submitted.
   */
  private boolean required;

  /**
   * The minimum length requirement this field must meet before the form can be submitted.
   * This is regardless if the field is {@link Validate#required}.
   */
  private int minLength;

  /**
   * The maximum length requirement this field must meet before the form can be submitted.
   * This is regardless if the field is {@link Validate#required}.
   */
  private int maxLength;

  /**
   * The regular expression pattern test that the field value must pass before the form can be submitted.
   * This is regardless if the field is {@link Validate#required}.
   */
  @Nullable
  private String regExPattern;

  public boolean isRequired() {
    return required;
  }

  public int getMinLength() {
    return minLength;
  }

  public int getMaxLength() {
    return maxLength;
  }

  @Nullable
  public String getRegExPattern() {
    return regExPattern;
  }
}
