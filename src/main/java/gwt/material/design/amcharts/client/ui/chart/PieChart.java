package gwt.material.design.amcharts.client.ui.chart;

import gwt.material.design.amcharts.client.ui.chart.base.ListTemplate;
import gwt.material.design.amcharts.client.ui.chart.series.PieSeries;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = "am4charts")
public class PieChart extends SerialChart {

    @JsProperty
    public ListTemplate<PieSeries> series;

    @JsProperty
    public Object[] data;

}
