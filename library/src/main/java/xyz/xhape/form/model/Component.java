package xyz.xhape.form.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by ajavonitalla on 11/12/2016.
 */
public class Component {

  /**
   * Will determine what input/layout field to use.
   */
  @NonNull
  private Type type;

  /**
   * Used only for {@link DisplayType#WIZARD}
   */
  private int numPages;

  //region Display attributes

  /**
   * The label for this field that will appear next to it.
   */
  @NonNull
  private String label;

  /**
   * The will be the value for this field, before user interaction.
   * Having a default value will override the placeholder text.
   */
  @Nullable
  private String defaultValue;

  /**
   * The placeholder text that will appear when this field is empty.
   */
  @Nullable
  private String placeHolder;

  /**
   * An input mask helps the user with input by ensuring a predefined format.
   *
   * 9: numeric
   * a: alphabetical
   * *: alphanumeric
   *
   * Example telephone mask: (999) 999-9999
   */
  @Nullable
  private String inputMask;

  /**
   * Whether to use the unmasked or masked value.
   */
  private boolean useMaskedValue;

  /**
   * The text to show before a field.
   *
   * Example '$' , '@'
   */
  @Nullable
  private String prefix;

  /**
   * The text to show before a field.
   *
   * Example '$' , '@'
   */
  @Nullable
  private String suffix;

  /**
   * Will be used to order the fields
   */
  private int sequenceNumber;

  //endregion

  //region Input Type (input=true) attributes

  /**
   * Attributes used for validation of InputType fields
   */
  @Nullable
  private Validate validate;

  /**
   * Attributes to determine whether to show this field or not
   */
  @Nullable
  private Conditional conditional;

  //endregion

  //use the builder to construct
  private Component(@NonNull Type type, @NonNull String label, int numPages, @Nullable String defaultValue,
      @Nullable String placeHolder, @Nullable String inputMask, boolean useMaskedValue, @Nullable String prefix,
      @Nullable String suffix, int sequenceNumber, @Nullable Validate validate, @Nullable Conditional conditional) {
    this.type = type;
    this.numPages = numPages;
    this.label = label;
    this.defaultValue = defaultValue;
    this.placeHolder = placeHolder;
    this.inputMask = inputMask;
    this.useMaskedValue = useMaskedValue;
    this.prefix = prefix;
    this.suffix = suffix;
    this.sequenceNumber = sequenceNumber;
    this.validate = validate;
    this.conditional = conditional;
  }

  @NonNull
  public Type getType() {
    return type;
  }

  public int getNumPages() {
    return numPages;
  }

  @NonNull
  public String getLabel() {
    return label;
  }

  @Nullable
  public String getDefaultValue() {
    return defaultValue;
  }

  @Nullable
  public String getPlaceHolder() {
    return placeHolder;
  }

  @Nullable
  public String getInputMask() {
    return inputMask;
  }

  public boolean isUseMaskedValue() {
    return useMaskedValue;
  }

  @Nullable
  public String getPrefix() {
    return prefix;
  }

  @Nullable
  public String getSuffix() {
    return suffix;
  }

  public int getSequenceNumber() {
    return sequenceNumber;
  }

  @Nullable
  public Validate getValidate() {
    return validate;
  }

  @Nullable
  public Conditional getConditional() {
    return conditional;
  }

  public static class Builder {

    @NonNull
    private Type _type;

    @NonNull
    private String _label;

    private int _numPages;

    private String _defaultValue;

    private String _placeHolder;

    private String _inputMask;

    private boolean _useMaskedValue;

    private String _prefix;

    private String _suffix;

    private int _sequenceNumber;

    private Validate _validate;

    private Conditional _conditional;

    public Builder(@NonNull Type _type, @NonNull String _label) {
      this._type = _type;
      this._label = _label;
    }

    public void numPages(int _numPages) {
      this._numPages = _numPages;
    }

    public void defaultValue(String _defaultValue) {
      this._defaultValue = _defaultValue;
    }

    public void placeHolder(String _placeHolder) {
      this._placeHolder = _placeHolder;
    }

    public void inputMask(String _inputMask) {
      this._inputMask = _inputMask;
    }

    public void useMaskedValue(boolean _useMaskedValue) {
      this._useMaskedValue = _useMaskedValue;
    }

    public void prefix(String _prefix) {
      this._prefix = _prefix;
    }

    public void suffix(String _suffix) {
      this._suffix = _suffix;
    }

    public void sequenceNumber(int _sequenceNumber) {
      this._sequenceNumber = _sequenceNumber;
    }

    public void validate(Validate _validate) {
      this._validate = _validate;
    }

    public void conditional(Conditional _conditional) {
      this._conditional = _conditional;
    }

    public Component build() {
      return new Component(_type, _label, _numPages, _defaultValue, _placeHolder, _inputMask, _useMaskedValue, _prefix,
          _suffix, _sequenceNumber, _validate, _conditional);
    }
  }
}
