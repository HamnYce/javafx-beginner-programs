package com.example.assignment4;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox();
        Scene scene = new Scene(root, 300, 300);

        root.getChildren().add(new MainMenuBuilder().build());
        root.getChildren().add(addMenuButtons(root));

        scene.getStylesheets().add("styles/default.css");

        stage.setResizable(true);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private Node addMenuButtons(VBox root) {
        HBox hBox = new HBox();

        Button ticTacToeButton = new Button("TicTacToe");
        ticTacToeButton.minWidth(100);
        Button matrixButton = new Button("Matrix");
        matrixButton.minWidth(100);
        Button geometryButton = new Button("Geometry");
        geometryButton.minWidth(100);

        ticTacToeButton.setOnAction(e -> {
            root.getChildren().set(0, getTicTacToeScreen());
        });
        matrixButton.setOnAction(e -> {
            root.getChildren().set(0, getMatrixScreen());
        });
        geometryButton.setOnAction(e -> {
            root.getChildren().set(0, getGeometryScreen());
        });

        hBox.getChildren().addAll(ticTacToeButton, matrixButton, geometryButton);
        return hBox;
    }

    private Parent getTicTacToeScreen() {
        return new TicTacToeBuilder().build();
    }

    private Parent getMatrixScreen() {
        return new MatrixBuilder().build();
    }

    private Parent getGeometryScreen() {
        return new GeometryBuilder().build();
    }
}
