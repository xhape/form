package xyz.xhape.form.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import xyz.xhape.form.model.Component;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class CheckboxWidget extends AppCompatCheckBox implements Widget<Boolean> {

  @Nullable
  private Component component;

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
  public Boolean getValue() {
    return isChecked();
  }

}
