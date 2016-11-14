package xyz.xhape.form.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.view.ViewGroup;
import xyz.xhape.form.model.Component;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class CheckboxWidget extends ViewGroup implements Widget<Boolean> {

  @Nullable
  private Component component;

  @NonNull
  private AppCompatCheckBox checkBox;

  public CheckboxWidget(Context context, @NonNull Component component) {
    super(context);
    this.component = component;
  }

  public CheckboxWidget(Context context) {
    super(context);
  }

  public CheckboxWidget(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public CheckboxWidget(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

  }

  @Override
  public Boolean getValue() {
    return this.checkBox.isChecked();
  }

}
