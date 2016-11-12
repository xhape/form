package xyz.xhape.form.widget;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class InvalidWidget extends TextView implements Widget {

  public InvalidWidget(Context context) {
    super(context);
  }

  @Override
  public Object getValue() {
    return null;
  }
}
