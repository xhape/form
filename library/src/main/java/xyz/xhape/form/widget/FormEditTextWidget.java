package xyz.xhape.form.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import xyz.xhape.form.model.Component;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class FormEditTextWidget extends AppCompatEditText {

  @Nullable
  private Component component;

  public FormEditTextWidget(Context context, @Nullable Component component) {
    super(context);
    this.component = component;
  }

  public FormEditTextWidget(Context context) {
    super(context);
  }

  public FormEditTextWidget(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public FormEditTextWidget(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }
}
