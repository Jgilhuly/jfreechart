/* ======================================================
 * JFreeChart : a chart library for the Java(tm) platform
 * ======================================================
 *
 * Simple Demo Application
 *
 * This demo creates a simple XY line chart with sample data
 * and displays it in a Swing window.
 */

package org.jfree.chart.demo;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.swing.ApplicationFrame;
import org.jfree.chart.swing.ChartPanel;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * A simple demonstration application showing how to create and display
 * a chart using JFreeChart.
 */
public class SimpleChartDemo extends ApplicationFrame {

    /**
     * Constructs the demo application.
     *
     * @param title  the frame title.
     */
    public SimpleChartDemo(String title) {
        super(title);
        
        // Create sample dataset
        XYSeries<String> series1 = new XYSeries<>("Series 1");
        for (int i = 0; i < 20; i++) {
            series1.add(i, Math.sin(i * 0.1) * 10 + 20);
        }
        
        XYSeries<String> series2 = new XYSeries<>("Series 2");
        for (int i = 0; i < 20; i++) {
            series2.add(i, Math.cos(i * 0.1) * 10 + 20);
        }
        
        XYSeriesCollection<String> dataset = new XYSeriesCollection<>();
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        
        // Create the chart
        JFreeChart chart = ChartFactory.createXYLineChart(
            "Simple Chart Demo",      // Chart title
            "X Axis",                 // X-axis label
            "Y Axis",                 // Y-axis label
            dataset,                  // Dataset
            PlotOrientation.VERTICAL, // Plot orientation
            true,                     // Show legend
            true,                     // Show tooltips
            false                     // Generate URLs
        );
        
        // Create and set up the panel
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        setContentPane(chartPanel);
    }

    /**
     * Starting point for the demo application.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {
        SimpleChartDemo demo = new SimpleChartDemo("JFreeChart Simple Demo");
        demo.pack();
        demo.setLocationRelativeTo(null);
        demo.setVisible(true);
    }
}

