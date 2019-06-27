package com.kodilla.blackjack;

import javafx.scene.control.Button;


public class GameController {

    private Deck deck;
    private Hand player;
    private Hand dealer;

    public GameController() {
        this.deck = new Deck(1);
    }

    public void startGame() throws Exception {
        System.out.println("zaczynasz grę");
        player = new Hand("Gracz");
        dealer = new Hand("Krupier");
        for (int i = 0; i < 2; i++) {
            player.addCard(deck);
            dealer.addCard(deck);
        }
        updateCardView();
    }

    private void updateCardView() {
        BlackjackApplication.playerCards.getChildren().clear();
        BlackjackApplication.dealerCards.getChildren().clear();

        for (int i = 0; i < player.getCardList().size(); i++) {
            BlackjackApplication.playerCards.getChildren().add(player.getCardList().get(i).getCardImage());
        }
        for (int i = 0; i < dealer.getCardList().size(); i++) {
            BlackjackApplication.dealerCards.getChildren().add(dealer.getCardList().get(i).getCardImage());
        }
    }

    public void playerMove() {
        if (player.evaluateHand() < 21) {
            player.addCard(deck);
            updateCardView();
        } else {
            //dealer move
        }


    }

    public void endGame() {
        Button exitButton = new Button("End Game");
    }
}
