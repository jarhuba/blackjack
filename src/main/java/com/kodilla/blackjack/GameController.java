package com.kodilla.blackjack;

import javafx.application.Platform;
import javafx.geometry.Orientation;
import javafx.scene.control.Button;


public class GameController {

    private Deck deck;
    private Hand player;
    private Hand dealer;

    public GameController() {
        this.deck = new Deck(1);
        this.player = new Hand("Gracz");
        this.dealer = new Hand("Krupier");
    }

    public void startGame() {
        System.out.println("zaczynasz grę");
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
        if (player.getHandValue() < 21) {
            player.addCard(deck);
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

    public void discardMove() {
        player.discardHand();
        dealerMove();
    }

    public void endGame() {
        Platform.exit();
        System.exit(0);
    }

    private Hand evaluateWinner() {
        System.out.println("player:" + player.getHandValue() + " vs krupier:" + dealer.getHandValue());
        System.out.println("player:" + player.isBusted() + " vs krupier:" + dealer.isBusted());
        if (player.isBusted()) {
            return dealer;
        } else if (dealer.isBusted()) {
            return player;
        } else if (player.getHandValue() == dealer.getHandValue()) {
            return dealer;
        } else if (player.getHandValue() < dealer.getHandValue()) {
            return dealer;
        } else if (player.getHandValue() > dealer.getHandValue()) {
            return player;
        }
        return dealer;
    }

    public void newGame() {
        player.clearHand();
        dealer.clearHand();
        updateCardView();
        this.deck = new Deck(1);
        startGame();
    }
}
