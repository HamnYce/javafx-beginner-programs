package com.example.assignment4;

import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.text.Text;
import javafx.util.Builder;

public class GeometryBuilder implements Builder<Parent> {
    @Override
    public Parent build() {
        Group result = new Group();

        // create 2 random points
        Point2D point1 = new Point2D(
                Widgets.createRandomCoordinate(),
                Widgets.createRandomCoordinate());
        Point2D point2 = new Point2D(
                Widgets.createRandomCoordinate(),
                Widgets.createRandomCoordinate());

        // Create 2 filled circles
        result.getChildren().addAll(
                Widgets.createCircle(point1, 15),
                Widgets.createCircle(point2, 15));

        // create line joining 2 circles
        result.getChildren().add(Widgets.createLine(point1, point2));


        Point2D midpoint = point1.midpoint(point2);
        double distance = point1.distance(point2);
        distance = Math.round(distance * 100) / 100.0;

        result.getChildren().add(new Text(
                midpoint.getX(),
                midpoint.getY(),
                Double.toString(distance)));

        return result;
    }
}
