package xyz.xhape.form.model;

import android.support.annotation.NonNull;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public enum Type {

  // region Input Type Fields

  EDIT_TEXT("text", true),
  NUMBER("number", true),
  PASSWORD("password", true),
  TEXT_AREA("textarea", true),
  CHECKBOX("checkbox", true),
  SELECT_BOXES("selectboxes", true),
  SELECT("select", true),
  RADIO("radio", true),

  //endregion

  //region Special Input Type Fields

  EMAIL("email", true),
  PHONE_NUMBER("phonenumber", true),
  ADDRESS("address", true),
  DATE_TIME("datetime", true),
  CURRENCY("currency", true),
  FILE("file", true),
  SIGNATURE("signature", true),
  DATA_GRID("datagrid", true),

  //endregion

  //region Non-input Type Fields

  /**
   * When display type is {@link DisplayType#WIZARD}.
   * This is used to mark pages.
   *
   */
  PANEL("panel", false),
  COLUMNS("columns", false),

  //endregion

  // for unrecongnized type
  INVALID_TYPE("invalid", false);

  /**
   * Component name as appeared in the JSON file
   */
  @NonNull
  private String component;

  /**
   * Not all component are input. We use this flag to mark input and non-inout components
   */
  private boolean isInput;

  Type(@NonNull String component, boolean isInput) {
    this.component = component;
    this.isInput = isInput;
  }

  public Type getByValue(String component) {
    for (Type type : values()) {
      if (type.component.equals(component)) {
        return type;
      }
    }

    return INVALID_TYPE;
  }

  public boolean isInput() {
    return isInput;
  }
}
