package gwt.material.design.amcharts.client.ui.chart.base;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4core")
public class Container extends Sprite {

    @JsMethod
    public native Object createChild(Object object);
}