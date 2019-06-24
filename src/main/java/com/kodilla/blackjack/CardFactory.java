package com.kodilla.blackjack;

import com.kodilla.blackjack.Card;
import com.kodilla.blackjack.CardType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.*;

public class CardFactory {

    private Set<CardType> allCards = new HashSet<>();

    public CardFactory() {
        intCardInitMap();
    }

    private void intCardInitMap() {
        for (CardType ct : CardType.values()) {
            allCards.add(ct);
        }
    }

//    public Card validateCard(CardType cardType) {
//        String c = cardImageMap.get(cardType);
//        return new Card(cardType.name(), new ImageView(new Image(c)));
//        //iteruje po mapie i
//    }
}
