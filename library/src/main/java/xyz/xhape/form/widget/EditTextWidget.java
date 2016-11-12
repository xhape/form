package xyz.xhape.form.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import xyz.xhape.form.model.Component;
import xyz.xhape.form.model.Validate;
import xyz.xhape.form.widget.validator.TextWidgetValidator;
import xyz.xhape.form.widget.validator.WidgetValidator;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class EditTextWidget extends ViewGroup implements Widget<String> {

  @NonNull
  private AppCompatEditText editText;

  public EditTextWidget(Context context, @NonNull Component component) {
    super(context);

    if (component.getValidate() != null) {
      this.setupValidator(component.getValidate());
    }
  }

  public EditTextWidget(Context context) {
    super(context);
  }

  public EditTextWidget(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public EditTextWidget(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

  }

  private void setupValidator(@NonNull Validate validate) {
    if (validate.getMinLength() != null || validate.getMaxLength() != null){
      final WidgetValidator<String> widgetValidator =
          new TextWidgetValidator(validate.getMinLength(), validate.getMaxLength());

      this.editText.addTextChangedListener(new AfterTextChanged() {
        @Override
        public void afterTextChanged(Editable editable) {
          widgetValidator.validate(editable.toString());
        }
      });
    }
  }

  @Override
  public String getValue() {
    return null;
  }
}
