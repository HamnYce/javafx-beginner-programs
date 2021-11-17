package com.example.assignment4;

import javafx.application.Application;
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

        // TODO:
        //  creating a gui button on the bottom left that launches that method
        //  by passing in the stage as a param and using stage.show() in the
        //  external method

        root.getChildren().add(new TicTacToeBuilder().build());
        HBox hBox = new HBox(50);

        Button button1 = new Button("TicTacToe");
        Button button2 = new Button("Matrix");
        Button button3 = new Button("Geometry");
        button1.setOnAction(e -> {
            root.getChildren().set(0, getTicTacToeScreen());
        });
        button2.setOnAction(e -> {
            root.getChildren().set(0, getMatrixScreen());
        });
        button3.setOnAction(e -> {
            root.getChildren().set(0, getGeometryScreen());
        });
        hBox.getChildren().addAll(button1, button2, button3);

        root.getChildren().add(hBox);


        scene.getStylesheets().add("styles/default.css");

        stage.setResizable(true);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
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
