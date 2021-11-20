package com.example.assignment4;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Builder;

public class MainMenuBuilder implements Builder<Parent> {
    @Override
    public Parent build() {
        StackPane results = new StackPane();
        results.setPadding(new Insets(100, 0, 100, 0));
        Text text = new Text("Title Screen");
        text.setFont(Font.font("Times New Roman", 30));

        results.getChildren().add(text);

        return results;
    }
}
