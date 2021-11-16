package com.example.assignment4;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = Widgets.getProject();
        Scene scene = new Scene(root, 300, 300);


        // TODO: create a while loop that changes between the multiple scenes
        //  by creating multiple scenes before hand and using the
        //  standard input to change between them OR
        //  creating a gui button on the bottom left that launches that method
        //  by passing in the stage as a param and using stage.show() in the
        //  external method

        scene.getStylesheets().add("styles/default.css");
        stage.setResizable(false);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
