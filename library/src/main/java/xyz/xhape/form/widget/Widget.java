package xyz.xhape.form.widget;

/**
 * Created so we can make the result of {@link WidgetFactory} generic.
 *
 * Created by ajavonitalla on 11/12/2016.
 */

public interface Widget<T> {

  T getValue();
}
