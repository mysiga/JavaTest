package com.mysiga.learn;

/**
 * Created by Wilson on 2017/12/6.
 */
public class ChartDisplay extends BaseChart {
    BaseChart chart;

    public void setChart(BaseChart chart) {
        this.chart = chart;
    }

    @Override
    void display() {
        chart.display();
    }
}
