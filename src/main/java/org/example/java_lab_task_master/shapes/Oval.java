package org.example.java_lab_task_master.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Oval extends Shape {
    private double radiusX;
    private double radiusY;
    private double x, y;

    public Oval(Color color, double radiusX, double radiusY) {
        super(color);
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public void draw(GraphicsContext gc, double x, double y, Color color, int strokeWidth, Color strokeColor) {
        if (strokeWidth != 0) {
            gc.setLineWidth(strokeWidth);
            gc.setStroke(strokeColor);
            gc.strokeOval(x, y, radiusX * 2, radiusY * 2);
        }

        gc.setFill(color);
        gc.fillOval(x, y, radiusX * 2, radiusY * 2);
    }

    @Override
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Овал";
    }
}
