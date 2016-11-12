package xyz.xhape.form.model;

import android.support.annotation.NonNull;
import java.util.List;

/**
 * Created by ajavonitalla on 11/12/2016.
 */
public class Form {

  @NonNull
  private List<Component> components;

  private DisplayType displayType;

  /**
   * Useful in wizard mode (multi-page)
   */
  private int numPages;
}
