package xyz.xhape.form.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.AppCompatEditText;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import xyz.xhape.form.R;
import xyz.xhape.form.model.Component;
import xyz.xhape.form.widget.validator.TextWidgetValidator;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class EditTextWidget extends ViewGroup implements Widget<String> {

  @NonNull
  private TextInputLayout layout;

  @NonNull
  private AppCompatEditText editText;

  public EditTextWidget(Context context, ViewGroup root, @NonNull Component component) {
    super(context);

    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    this.layout = (TextInputLayout) inflater.inflate(R.layout.edit_text_widget, root);
    this.editText = (AppCompatEditText) this.layout.findViewById(R.id.edit_text);

    if (component.getValidate() != null) {
      this.setupValidator(component.getValidate().getMinLength(), component.getValidate().getMaxLength());
    }
  }

  public EditTextWidget(Context context, AttributeSet attrs) {
    super(context, attrs);

    LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    this.layout = (TextInputLayout) inflater.inflate(R.layout.edit_text_widget, null);
    this.editText = (AppCompatEditText) this.layout.findViewById(R.id.edit_text);

    TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.EditTextWidget);
    if (typedArray.hasValue(R.styleable.EditTextWidget_minLength)) {
      int minLength = typedArray.getInt(R.styleable.EditTextWidget_minLength, 0);
      int maxLength = typedArray.getInt(R.styleable.EditTextWidget_maxLength, 0);
      this.setupValidator(minLength, maxLength);
    }

    typedArray.recycle();
  }

  private void setupValidator(@Nullable Integer minLength, @Nullable Integer maxLength) {
    if (maxLength != null && maxLength > 0) {
      //this will prevent the user from typing more characters but it will not prevent the user from pasting more characters
      this.editText.setFilters(new InputFilter[] { new InputFilter.LengthFilter(maxLength) });
    }

    if (minLength != null || maxLength != null) {
      TextWatcher validator = new TextWidgetValidator(this.layout, minLength, maxLength);
      this.editText.addTextChangedListener(validator);
    }
  }

  @Override
  protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

  }

  @Override
  public String getValue() {
    return this.editText.getEditableText().toString();
  }
}
