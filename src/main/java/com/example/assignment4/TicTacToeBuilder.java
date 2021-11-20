package com.example.assignment4;


import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.util.Builder;


public class TicTacToeBuilder implements Builder<Region> {
    @Override
    public Region build() {
        BorderPane results = new BorderPane();

        results.setCenter(Widgets.createTicTacToeBoard());
        results.setPadding(new Insets(75,0,0,75));
//        results.getChildren().add(Widgets.createTicTacToeBoard());

        results.getStyleClass().add("test-border");

        return results;
    }
}
