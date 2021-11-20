package com.example.assignment4;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.util.Builder;

import java.util.Random;

public class MatrixBuilder implements Builder<Region> {
    @Override
    public Region build() {
        GridPane results = new GridPane();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                results.add(Widgets.createTextField(getRandomNum().toString()),i,j);
            }
        }

        return results;
    }



    private Integer getRandomNum() {
        return new Random().nextInt(2);
    }
}
