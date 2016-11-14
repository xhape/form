package xyz.xhape.form.widget.validator;

import android.support.annotation.Nullable;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class NumberWidgetValidator implements WidgetValidator<Double> {

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

  public NumberWidgetValidator(@Nullable Double minValue, @Nullable Double maxValue) {
    this.minValue = minValue;
    this.maxValue = maxValue;
  }

  @Override
  public void validate(Double value) {
    if (this.minValue != null && (value == null || value < this.minValue)) {
      //return new ValidationResult(false, "Minimum value is " + this.minValue, "lesser_than_min_value");
    }

    if (this.maxValue != null && (value == null || value > this.maxValue)) {
      //return new ValidationResult(false, "Maximum value is " + this.maxValue, "greater_than_max_value");
    }

    //return ValidationResult.SUCCESS;
  }
}
