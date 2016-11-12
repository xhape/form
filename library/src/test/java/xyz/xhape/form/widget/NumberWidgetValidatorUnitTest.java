package xyz.xhape.form.widget;

import org.junit.Test;
import xyz.xhape.form.widget.validator.NumberWidgetValidator;
import xyz.xhape.form.widget.validator.ValidationResult;
import xyz.xhape.form.widget.validator.WidgetValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ajavonitalla on 11/12/2016.
 */
public class NumberWidgetValidatorUnitTest {

  @Test
  public void no_min_max_should_pass() throws Exception {
    WidgetValidator<Double> validator = new NumberWidgetValidator(null, null);
    ValidationResult result = validator.validate(6.0);

    assertTrue(result.isValid());
  }

  @Test
  public void below_min_should_fail() throws Exception {
    WidgetValidator<Double> validator = new NumberWidgetValidator(10.0, null);
    ValidationResult result = validator.validate(6.0);

    assertFalse(result.isValid());
  }

  @Test
  public void above_max_should_fail() throws Exception {
    WidgetValidator<Double> validator = new NumberWidgetValidator(null, 10.0);
    ValidationResult result = validator.validate(16.0);

    assertFalse(result.isValid());
  }

  @Test
  public void between_min_max_should_pass() throws Exception {
    WidgetValidator<Double> validator = new NumberWidgetValidator(6.0, 10.0);
    ValidationResult result = validator.validate(8.0);

    assertTrue(result.isValid());
  }

  @Test
  public void equal_max_should_pass() throws Exception {
    WidgetValidator<Double> validator = new NumberWidgetValidator(6.0, 10.0);
    ValidationResult result = validator.validate(10.0);

    assertTrue(result.isValid());
  }

  @Test
  public void equal_min_should_pass() throws Exception {
    WidgetValidator<Double> validator = new NumberWidgetValidator(6.0, 10.0);
    ValidationResult result = validator.validate(6.0);

    assertTrue(result.isValid());
  }
}
