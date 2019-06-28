package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cardList;
    private String name;
    private int handValue;
    private boolean busted;

    public Hand(String name) {
        this.name = name;
        cardList = new ArrayList<>();
        this.handValue = 0;
        busted = false;
    }

    void addCard(Deck deck) {
        cardList.add(deck.dealCard());
    }

    void discardHand() {
        //    evaluateHand();
        System.out.println("ruch krupiera");
    }


    public void evaluateHand() {
        handValue = 0;
        for (Card c : cardList) {
            if (!c.rank.getRank().equals(Rank.ACE)) {
                handValue += c.rank.getValue();
                System.out.println(handValue);
            } else {
                if (handValue <= 10) {
                    handValue += 11;
                } else {
                    handValue += 1;
                }
            }
        }
        System.out.println("handValue: " + handValue);
        if (this.handValue > 21) {
            busted = true;
        }
    }

    public void clearHand() {
        cardList.clear();
        busted = false;
        handValue = 0;
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

    public int getHandValue() {
        return handValue;
    }

    public String getName() {
        return name;
    }

    public boolean isBusted() {
        return busted;
    }
}

