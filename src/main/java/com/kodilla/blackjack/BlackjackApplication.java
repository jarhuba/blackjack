package com.kodilla.blackjack;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class BlackjackApplication extends Application {

    public static final String IMG_PATH = "file:src/main/resources";
    public static FlowPane playerCards;
    public static FlowPane dealerCards;
    public static Label whoWins;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        playerCards = new FlowPane(Orientation.VERTICAL);
        dealerCards = new FlowPane(Orientation.VERTICAL);
        whoWins = new Label("Wygrał...");

        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        System.out.println("jdk:" + javafxVersion + " fx:" + javafxVersion);

        ImageView imageback = new ImageView(IMG_PATH + "/table.png");
        imageback.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);

        Button drawCardButton = new Button("Wyłóż kolejną kartę");
        Button enoughtCardButton = new Button("Kończę kolejkę");
        Button newGameButton = new Button("Nowa gra");
        Button endGameButton = new Button("Koniec gry");
        //Label playerInfo = new Label("TEST");
        //playerInfo.setLabelFor(endGameButton);
        //playerCards.getChildren().add(playerInfo);


        grid.add(playerCards, 0, 0, 1, 1);
        //grid.add(playerInfo,0,1,1,1);
        grid.add(dealerCards, 0, 2, 1, 1);
        //grid.add(playerInfo,0,1,1,1);


        grid.add(drawCardButton, 0, 4, 1, 1);
        grid.add(enoughtCardButton, 0, 5, 1, 1);
        grid.add(newGameButton, 0, 6, 1, 1);
        grid.add(endGameButton, 0, 7, 1, 1);

        Scene scene = new Scene(grid, 1597, 898, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BlackJack");
        primaryStage.setResizable(false);
        primaryStage.show();

        GameController gc = new GameController();
        drawCardButton.setOnAction(e -> gc.playerMove());
        enoughtCardButton.setOnAction((e -> gc.dealerMove()));
        newGameButton.setOnAction((e -> gc.newGame()));
        endGameButton.setOnAction((e -> gc.endGame()));
        gc.startGame();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Koniec działania aplikacji");
        super.stop();
    }
}