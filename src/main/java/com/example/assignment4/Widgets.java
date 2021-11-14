package com.example.assignment4;

import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Random;

public class Widgets {
    public static Node createLine(Point2D point1, Point2D point2) {
        Line line = new Line();
        line.setStartX(point1.getX());
        line.setStartY(point1.getY());
        line.setEndX(point2.getX());
        line.setEndY(point2.getY());
        line.setFill(Color.BLACK);
        line.setStrokeWidth(3);

        return line;
    }

    public static Node createCircle(Point2D point, double radius) {
        Circle circle = new Circle();
        circle.setRadius(radius);
        circle.setFill(Color.BLACK);
        circle.setCenterX(point.getX());
        circle.setCenterY(point.getY());

        return circle;
    }

    public static Integer createRandomCoordinate() {
        // 300 (screen size) - 15 + 1 (nextInt is upper bound exclusive)
        return new Random().nextInt(286);
    }

    public static Node createTicTacToeBoard() {
        GridPane result = new GridPane();
        result.add(createTicTacToeCell(), 0, 0);
        result.add(createTicTacToeCell(), 1, 0);
        result.add(createTicTacToeCell(), 2, 0);
        result.add(createTicTacToeCell(), 0, 1);
        result.add(createTicTacToeCell(), 1, 1);
        result.add(createTicTacToeCell(), 2, 1);
        result.add(createTicTacToeCell(), 0, 2);
        result.add(createTicTacToeCell(), 1, 2);
        result.add(createTicTacToeCell(), 2, 2);

        return result;
    }

    private static Node createTicTacToeCell() {
        Button button = new Button();

        final ButtonAction buttonAction = new ButtonAction();
        button.setMinHeight(50);
        button.setMinWidth(50);
        button.setPadding(new Insets(0));

        button.setOnAction(e -> {
            button.setGraphic(buttonAction.changeImage(button.getGraphic()));
        });

        return button;
    }

    public static Node createTextField(String s) {
        return new TextField(s);
    }

    public static Node createHeaderText(String s) {
        Node headerText = createText(s);
        headerText.getStyleClass().add("heading-text");
        return headerText;
    }

    public static Node createText(String s) {
        return new Text(s);
    }


}