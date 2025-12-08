package com.example.draw;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {

    @FXML
    private Canvas canvas;

    @FXML
    void onMouseDragged(MouseEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.LIGHTGRAY);
        gc.setStroke(Color.GREEN);
        gc.setLineWidth(5);
        gc.strokeLine(event.getX(), event.getY(), event.getX(), event.getY());


    }

    @FXML
    void onMousePressed(MouseEvent event) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
       gc.beginPath();
       gc.moveTo(event.getX(), event.getY());
    }

    @FXML
    void onClear() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }
}
