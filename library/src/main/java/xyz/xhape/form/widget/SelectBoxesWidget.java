package xyz.xhape.form.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.List;

/**
 * Created by ajavonitalla on 11/12/2016.
 */

public class SelectBoxesWidget extends ViewGroup implements Widget<List<String>> {

  public SelectBoxesWidget(Context context) {
    super(context);
  }

  public SelectBoxesWidget(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public SelectBoxesWidget(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override
  protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

  }

  @Override
  public List<String> getValue() {
    return null;
  }
}
