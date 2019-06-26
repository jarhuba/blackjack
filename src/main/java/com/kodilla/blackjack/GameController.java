package com.kodilla.blackjack;

import javafx.scene.control.Button;

public class GameController {

    public void startGame() throws Exception{
        System.out.println("zaczynasz grę");
        Deck deck = new Deck(1);
        Hand player = new Hand("Gracz");
        Hand dealer = new Hand("Krupier");
        for (int i = 0; i<1; i++) {
            player.addCard(deck.dealCard());
            dealer.addCard(deck.dealCard());
        }
    }

    public void endGame() {
        Button exitButton = new Button("End Game");
    }
}
