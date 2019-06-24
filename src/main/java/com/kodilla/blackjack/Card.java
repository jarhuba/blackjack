package com.kodilla.blackjack;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public interface Card {

    String getName();
    int getCardValue();
    ImageView getCardImage();



    //private Button button;
    //private String name;
    //private ImageView image;

    //public Card(String name, ImageView image) {
    //    this.name = name;
    //    this.image = image;
    //}
}
