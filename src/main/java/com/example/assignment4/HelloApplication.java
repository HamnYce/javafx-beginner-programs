package com.example.assignment4;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = new GeometryBuilder().build();
        Scene scene = new Scene(root, 300, 300);


        scene.getStylesheets().add("styles/default.css");
        stage.setResizable(false);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }

    private Parent getProgram() {

    }
}
