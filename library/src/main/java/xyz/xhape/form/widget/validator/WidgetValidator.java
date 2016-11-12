package xyz.xhape.form.widget.validator;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public interface WidgetValidator<T> {

  /**
   *
   * @param value
   * @return true if @param value is valid
   */
  ValidationResult validate(T value);
}
