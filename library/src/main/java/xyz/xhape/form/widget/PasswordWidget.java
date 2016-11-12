package xyz.xhape.form.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.ViewGroup;
import xyz.xhape.form.model.Component;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class PasswordWidget extends ViewGroup implements Widget<String> {

  @Nullable
  private Component component;

  public PasswordWidget(Context context, @Nullable Component component) {
    super(context);
    this.component = component;
  }

  public PasswordWidget(Context context) {
    super(context);
  }

  public PasswordWidget(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public PasswordWidget(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

  }

  @Override
  public String getValue() {
    return null;
  }
}
