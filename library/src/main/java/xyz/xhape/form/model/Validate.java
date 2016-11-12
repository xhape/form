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

  /**
   * The minimum value requirement this field must meet before the form can be submitted.
   * Using Object instead of the primitive so we know it's actually set.
   * 0.0 is a valid value.
   */
  @Nullable
  private Double minValue;

  /**
   * The maximum value requirement this field must meet before the form can be submitted.
   * Using Object instead of the primitive so we know it's actually set.
   * 0.0 is a valid value.
   */
  @Nullable
  private Double maxValue;

  /**
   * The regular expression pattern test that the field value must pass before the form can be submitted.
   * This is regardless if the field is {@link Validate#required}.
   */
  @Nullable
  private String regExPattern;

  public boolean isRequired() {
    return required;
  }

  @Nullable
  public Integer getMinLength() {
    return minLength;
  }

  @Nullable
  public Integer getMaxLength() {
    return maxLength;
  }

  @Nullable
  public String getRegExPattern() {
    return regExPattern;
  }
}
