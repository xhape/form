package xyz.xhape.form.model;

import android.support.annotation.NonNull;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public enum DisplayType {
  FORM("form"),

  /**
   * A multi-page form
   */
  WIZARD("wizard"),

  /**
   * Unrecognized display type
   */
  INVALID("invalid");

  @NonNull
  private String value;

  DisplayType(@NonNull String value) {
    this.value = value;
  }

  @NonNull
  public DisplayType getByValue(String component) {
    for (DisplayType type : values()) {
      if (type.value.equals(component)) {
        return type;
      }
    }

    return INVALID;
  }
}
