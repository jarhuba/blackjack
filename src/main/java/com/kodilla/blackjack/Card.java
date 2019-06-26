package com.kodilla.blackjack;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class Card {

    Rank rank;
    Suit color;

    public Card(Rank rank, Suit color) {
        this.rank = rank;
        this.color = color;
    }

    public static String getFilename(Suit color, Rank rank) {
        StringBuilder filePath = new StringBuilder();
        filePath.append(BlackjackApplication.IMG_PATH + "/cards/");
        filePath.append(rank.getRank() + "_of_");
        filePath.append(color.getColor() + ".png");
        return filePath.toString();
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getColor() {
        return color;
    }

    ImageView getCardImage() {
        ImageView img = new ImageView(getFilename(getColor(), getRank()));
        img.setPreserveRatio(true);
        img.setSmooth(true);
        img.setFitHeight(300.0);
        return img;
    }


    //private Button button;
    //private String name;
    //private ImageView image;

    //public Card(String name, ImageView image) {
    //    this.name = name;
    //    this.image = image;
    //}
}

enum Suit {

    CLUBS("clubs"), DIAMONDS("diamonds"), HEARTS("hearts"), SPADES("spades");


    private String color;

    Suit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

enum Rank {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("jack"),
    QUEEN("queen"),
    KING("king"),
    ACE("ace");

    String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
