package xyz.xhape.form.widget.validator;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class ValidationResult {

  public static ValidationResult SUCCESS = new ValidationResult(true);

  private boolean isValid;

  private String message;

  private String errorCode;

  public ValidationResult(boolean isValid) {
    this.isValid = isValid;
  }

  public ValidationResult(boolean isValid, String message, String errorCode) {
    this.isValid = isValid;
    this.message = message;
    this.errorCode = errorCode;
  }

  public boolean isValid() {
    return isValid;
  }

  public String getMessage() {
    return message;
  }

  public String getErrorCode() {
    return errorCode;
  }
}
