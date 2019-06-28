package com.kodilla.blackjack;

import javafx.scene.control.Button;


public class GameController {

    private Deck deck;
    private Hand player;
    private Hand dealer;

    public GameController() {
        this.deck = new Deck(1);
    }

    public void startGame() {
        System.out.println("zaczynasz grę");
        player = new Hand("Gracz");
        dealer = new Hand("Krupier");
        for (int i = 0; i < 2; i++) {
            player.addCard(deck);
            dealer.addCard(deck);
        }
        player.evaluateHand();
        dealer.evaluateHand();
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
        if (player.getHandValue() < 21) {
            player.addCard(deck);
            player.evaluateHand();
            updateCardView();
        } else {
            if (player.isBusted()) {
                evaluateWinner();
            } else {
                dealerMove();
            }
        }
    }

    public void dealerMove() {
        dealer.evaluateHand();
        if (dealer.getHandValue() < 16) {
            dealer.addCard(deck);
            dealer.evaluateHand();
            updateCardView();
            dealerMove();
        } else {
            System.out.println("Wygrał " + evaluateWinner().getName());
        }
    }

    public void endGame() {
    }

    private Hand evaluateWinner() {
        System.out.println("player:" + player.getHandValue() + " vs krupier:" + dealer.getHandValue());
        if (player.getHandValue() > dealer.getHandValue() && !player.isBusted()) {
            return dealer;
        } else {
            return player;
        }
    }

    public void newGame() {
        player.clearHand();
        dealer.clearHand();
        updateCardView();
        startGame();
    }
}
