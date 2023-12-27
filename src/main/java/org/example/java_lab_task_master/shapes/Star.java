package org.example.java_lab_task_master.shapes;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
public class Star extends Shape {
    private double size;
    private double x, y;

    public Star(Color color, double size) {
        super(color);
        this.size = size;
    }

    @Override
    public void draw(GraphicsContext gc, double x, double y, Color color, int strokeWidth, Color strokeColor) {
        if (strokeWidth != 0) {
            gc.setLineWidth(strokeWidth);
            gc.setStroke(strokeColor);
            // Нарисовать звезду (нужно доработать)
            double centerX = x;
            double centerY = y;
            double outerRadius = size / 2.0;
            double innerRadius = size / 4.0;
            int numPoints = 5;

            gc.beginPath();
            for (int i = 0; i < numPoints * 2; i++) {
                double angle = Math.PI / numPoints * i;
                double radius = i % 2 == 0 ? outerRadius : innerRadius;
                double pointX = centerX + Math.cos(angle) * radius;
                double pointY = centerY + Math.sin(angle) * radius;
                if (i == 0) {
                    gc.moveTo(pointX, pointY);
                } else {
                    gc.lineTo(pointX, pointY);
                }
            }
            gc.closePath();
            gc.stroke();
        }

        gc.setFill(color);
        // Нарисовать звезду (нужно доработать)
        double centerX = x;
        double centerY = y;
        double outerRadius = size / 2.0;
        double innerRadius = size / 4.0;
        int numPoints = 5;

        gc.beginPath();
        for (int i = 0; i < numPoints * 2; i++) {
            double angle = Math.PI / numPoints * i;
            double radius = i % 2 == 0 ? outerRadius : innerRadius;
            double pointX = centerX + Math.cos(angle) * radius;
            double pointY = centerY + Math.sin(angle) * radius;
            if (i == 0) {
                gc.moveTo(pointX, pointY);
            } else {
                gc.lineTo(pointX, pointY);
            }
        }
        gc.closePath();
        gc.fill();
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
        return "Звезда";
    }
}
