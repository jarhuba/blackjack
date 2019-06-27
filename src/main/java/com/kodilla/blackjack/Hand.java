package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cardList;
    private String playerName;
    private int handValue;

    public Hand(String playerName) {
        this.playerName = playerName;
        cardList = new ArrayList<>();
        this.handValue = 0;
    }

    void addCard(Deck deck) {
        cardList.add(deck.dealCard());
    }

    void discardHand() {
        //    evaluateHand();
        System.out.println("ruch krupiera");
    }


    public int evaluateHand() {
        for (Card c : cardList) {
            if (!c.rank.getRank().equals(Rank.ACE)) {
                handValue += c.rank.getValue();
            } else {
                if (handValue <= 10) {
                    handValue += 11;
                } else {
                    handValue += 1;
                }
            }
        }
        return handValue;
    }
//    void evaluateHand(int playerTotal, int dealerTotal) {
//        String hand = null;
//        String dealer = null;
//        System.out.println("Karty gracza: " + hand);
//        System.out.println("Karty krupiera: " + dealer);
//
//        if (playerTotal == 21) {
//            System.out.println("Wygrałeś");
//            //      status.setText("Wygrałeś");
//        } else if (dealerTotal <= 21 && playerTotal == dealerTotal) {
//            System.out.println("Remis");
//            //      status.setText("Remis");
//        } else if (dealerTotal <= 21 && playerTotal <= dealerTotal) {
//            System.out.println("Przegrałeś");
//            //      status.setText("Przegrałeś");
//        } else {
//            System.out.println("Wygrałeś");
//            //      status.setText("Wygrałeś");
//        }
//    }

    public List<Card> getCardList() {
        return cardList;
    }

    public String getPlayerName() {
        return playerName;
    }
}

