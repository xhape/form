package xyz.xhape.form.widget;

import android.text.TextUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import xyz.xhape.form.widget.validator.TextWidgetValidator;
import xyz.xhape.form.widget.validator.ValidationResult;
import xyz.xhape.form.widget.validator.WidgetValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by ajavonitalla on 11/12/2016.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(TextUtils.class)
public class TextWidgetValidatorUnitTest {

  @Before
  public void setup() {
    PowerMockito.mockStatic(TextUtils.class);
    PowerMockito.when(TextUtils.isEmpty(Mockito.any(CharSequence.class))).thenAnswer(new Answer<Object>() {
      @Override
      public Boolean answer(InvocationOnMock invocation) throws Throwable {
        CharSequence a = (CharSequence) invocation.getArguments()[0];
        return !(a != null && a.length() > 0);
      }
    });
  }

  @Test
  public void no_min_max_should_pass() throws Exception {
    WidgetValidator<String> validator = new TextWidgetValidator(null, null);
    ValidationResult result = validator.validate("Test");

    assertTrue(result.isValid());
  }

  @Test
  public void below_min_should_fail() throws Exception {
    WidgetValidator<String> validator = new TextWidgetValidator(5, null);
    ValidationResult result = validator.validate("Test");

    assertFalse(result.isValid());
  }

  @Test
  public void above_max_should_fail() throws Exception {
    WidgetValidator<String> validator = new TextWidgetValidator(null, 3);
    ValidationResult result = validator.validate("Test");

    assertFalse(result.isValid());
  }

  @Test
  public void between_min_max_should_pass() throws Exception {
    WidgetValidator<String> validator = new TextWidgetValidator(3, 6);
    ValidationResult result = validator.validate("Test");

    assertTrue(result.isValid());
  }

  @Test
  public void equal_max_should_pass() throws Exception {
    WidgetValidator<String> validator = new TextWidgetValidator(3, 6);
    ValidationResult result = validator.validate("Tester");

    assertTrue(result.isValid());
  }

  @Test
  public void equal_min_should_pass() throws Exception {
    WidgetValidator<String> validator = new TextWidgetValidator(4, 6);
    ValidationResult result = validator.validate("Test");

    assertTrue(result.isValid());
  }
}
