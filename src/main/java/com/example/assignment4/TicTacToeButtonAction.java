package com.example.assignment4;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class TicTacToeButtonAction {
    int counter = 0;
    ArrayList<ImageView> imageViews;

    public TicTacToeButtonAction() {
        imageViews = new ArrayList<>();
        imageViews.add(new ImageView(new Image("assets/cross.png")));
        imageViews.add(new ImageView(new Image("assets/circle.jpeg")));
        imageViews.get(0).setFitHeight(50);
        imageViews.get(0).setFitWidth(50);
        imageViews.get(1).setFitHeight(50);
        imageViews.get(1).setFitWidth(50);
    }

    public ImageView changeImage(Node imageView) {
        ImageView result;
        if (imageView == imageViews.get(0)) return imageViews.get(1);
        else if (imageView == imageViews.get(1)) return null;
        else return imageViews.get(0);
    }
}
