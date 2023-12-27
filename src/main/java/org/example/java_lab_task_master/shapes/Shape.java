package org.example.java_lab_task_master.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

abstract public class Shape implements Cloneable{
    protected Color color;
    public Shape(Color color){
        this.color = color;
    }
    public void setColor (Color color){
        this.color = color;
    }

    public abstract void draw(GraphicsContext gc, double x, double y, Color color, int strokeWidth, Color strokeColor);

    public abstract void setXY(double x, double y);

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}