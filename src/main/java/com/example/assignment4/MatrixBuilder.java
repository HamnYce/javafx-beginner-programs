package com.example.assignment4;

import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.util.Builder;

import java.util.Random;

public class MatrixBuilder implements Builder<Region> {
    @Override
    public Region build() {
        GridPane result = new GridPane();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                result.add(Widgets.createTextField(getRandomNum().toString()),i,j);
            }
        }

        return result;
    }



    private Integer getRandomNum() {
        return new Random().nextInt(2);
    }
}
