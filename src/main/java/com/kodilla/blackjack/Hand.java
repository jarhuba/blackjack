package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cardList;
    private String playerName;

    public Hand(String playerName) {
        this.playerName = playerName;
        cardList = new ArrayList<>();
    }

    void addCard(Card card) {
        BlackjackApplication.cards.getChildren().add(card.getCardImage());
    }

    void discardHand() {
    //    evaluateHand();
        System.out.println("ruch krupiera");
    }

    void evaluateHand(int playerTotal, int dealerTotal) {
       String hand = null;
       String dealer = null;
        System.out.println("Karty gracza: " + hand);
        System.out.println("Karty krupiera: " + dealer);

        if (playerTotal == 21) {
            System.out.println("Wygrałeś");
      //      status.setText("Wygrałeś");
        } else if (dealerTotal <= 21 && playerTotal == dealerTotal) {
            System.out.println("Remis");
      //      status.setText("Remis");
        } else if (dealerTotal <= 21 && playerTotal <= dealerTotal) {
            System.out.println("Przegrałeś");
      //      status.setText("Przegrałeś");
        } else {
            System.out.println("Wygrałeś");
      //      status.setText("Wygrałeś");
        }
    }
}
