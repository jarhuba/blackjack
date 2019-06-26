package com.kodilla.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;
    private int index;

    public Deck(int numDecks) {
        deck = new ArrayList<>();
        index = 0;

        for (int i = 0; i < numDecks; i++) {
            for (Suit suit : Suit.values()) {
                for (Rank rank : Rank.values()) {
                    Card card = new Card(rank, suit);
                    addCard(card);
                }
            }
        }
        shuffle();
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public int getSizeOfDeck() {
        return deck.size();
    }

    public int getNumberOfCardsRemaining() {
        return deck.size() - index;
    }

    public Card dealCard() {
        if (index >= deck.size())
            return null;
        else
            return deck.get(index++);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void restoreDeck() {
        index = 0;
    }

    int numberOfCardRemaining() {
        return deck.size() - index + 1;
    }
}