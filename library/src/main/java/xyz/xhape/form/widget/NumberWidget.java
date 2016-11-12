package xyz.xhape.form.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import xyz.xhape.form.model.Component;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class NumberWidget extends EditTextWidget {

  public NumberWidget(Context context, @NonNull Component component) {
    super(context, component);
  }

  public NumberWidget(Context context) {
    super(context);
  }

  public NumberWidget(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public NumberWidget(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }
}
