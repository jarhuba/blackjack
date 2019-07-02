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
        evaluateHand();
    }

    void discardHand() {
        System.out.println("ruch krupiera");
    }

    public void evaluateHand() {
        handValue = 0;
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

        if (this.handValue > 21) {
            busted = true;
        }
        System.out.println("Hand:" + handValue);
    }

    public void clearHand() {
        cardList.clear();
        busted = false;
        handValue = 0;
    }

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

