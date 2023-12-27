package org.example.java_lab_task_master.shapes;

import javafx.scene.paint.Color;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<Integer, Shape> shapeMap;

    public ShapeFactory() {
        shapeMap = new HashMap<>();
        shapeMap.put(0, new Circle(Color.RED, 15));
        shapeMap.put(1, new Oval(Color.YELLOW, 24, 15));
        shapeMap.put(2, new Rectangle(Color.BLUE, 30, 45));
        shapeMap.put(3, new Triangle(Color.GREEN, 15, 30));
        shapeMap.put(4, new Star(Color.ORANGE, 30));
    }

    public Shape createShape(int id) {
        return shapeMap.get(id);
    }
}
