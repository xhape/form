package xyz.xhape.form.model;

import android.support.annotation.NonNull;

/**
 * Attributes to determine whether to show this field or not.
 * Currently only supports equal;
 *
 * Created by ajavonitalla on 11/12/2016.
 */
public class Conditional {

  /**
   * Whether to show or hide a {@link Component}
   */
  private boolean show;

  /**
   * The field to check
   */
  @NonNull
  private String when;

  /**
   * The value to check
   */
  @NonNull
  private String eq;

  public Conditional(boolean show, @NonNull String when, @NonNull String eq) {
    this.show = show;
    this.when = when;
    this.eq = eq;
  }

  public boolean isShow() {
    return show;
  }

  @NonNull
  public String getWhen() {
    return when;
  }

  @NonNull
  public String getEq() {
    return eq;
  }
}
