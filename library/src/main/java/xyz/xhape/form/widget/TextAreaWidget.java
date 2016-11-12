package xyz.xhape.form.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.ViewGroup;
import xyz.xhape.form.model.Component;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class TextAreaWidget extends ViewGroup implements Widget<String> {

  AppCompatEditText appCompatEditText;

  public TextAreaWidget(Context context, @Nullable Component component) {
    super(context);

    this.appCompatEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE);
  }

  public TextAreaWidget(Context context) {
    super(context);
  }

  public TextAreaWidget(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public TextAreaWidget(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

  }

  @Override
  public String getValue() {
    return this.appCompatEditText.getEditableText().toString();
  }
}
