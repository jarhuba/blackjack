package com.kodilla.blackjack.controller;

import com.kodilla.blackjack.Card;
import com.kodilla.blackjack.CardType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.HashMap;
import java.util.Map;

public class CardFactory {

    private Map<CardType, String> cardImageMap = new HashMap<>();

    public CardFactory() {
        intCardInitMap();
    }

    private void intCardInitMap() {

        //put do mapy wszystich kart

    }

    public Card createCard(CardType cardType) {
        String c = cardImageMap.get(cardType);
        return  new Card(cardType.name(), new ImageView(new Image(c)));
        //iteruje po mapie i
    }
}
