package org.example.java_lab_task_master.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import org.example.java_lab_task_master.shapes.ShapeFactory;
import org.example.java_lab_task_master.shapes.Shape;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ColorPicker cp_color;
    @FXML
    private ColorPicker cp_stroke;
    @FXML
    private ListView<String> listview;
    @FXML
    private TextField textfield_size;

    @FXML
    private Canvas canvas;
    public ObservableList<String> obs;
    private GraphicsContext gc;

    private ShapeFactory shapeFactory;


    @Override
    public void initialize(URL location, ResourceBundle resource) {
        shapeFactory = new ShapeFactory();
        gc = canvas.getGraphicsContext2D();
        obs = FXCollections.observableArrayList("Круг", "Овал", "Прямоугольник", "Треугольник", "Звезда");
        listview.setItems(obs);
        canvas.setOnMouseClicked(event -> drawShape(event));
    }

    @FXML
    private void drawShape(MouseEvent mouseEvent) {
        int index = listview.getSelectionModel().getSelectedIndex();
        Shape shapeOb = shapeFactory.createShape(index);

        double x = mouseEvent.getX();
        double y = mouseEvent.getY();

        Color defaultColor = Color.RED;
        int defaultStrokeWidth = 1;
        Color defaultStrokeColor = Color.BLACK;

        Color shapeColor = cp_color.getValue() != null ? cp_color.getValue() : defaultColor;

        int strokeWidth;
        try {
            strokeWidth = textfield_size.getText().isEmpty() ? defaultStrokeWidth : Integer.parseInt(textfield_size.getText());
        } catch (NumberFormatException e) {
            strokeWidth = defaultStrokeWidth;
        }

        shapeOb.setColor(shapeColor);
        shapeOb.draw(gc, x, y, shapeColor, strokeWidth, cp_stroke.getValue());
    }

    @FXML
    private void clearCanvas() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}