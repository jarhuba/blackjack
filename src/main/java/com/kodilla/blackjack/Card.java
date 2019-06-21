package com.kodilla.blackjack;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Card {

    private Button button;
    private  String name;
    private ImageView image;

    public Card(String name, ImageView image) {
        this.name = name;
        this.image = image;
    }
}
