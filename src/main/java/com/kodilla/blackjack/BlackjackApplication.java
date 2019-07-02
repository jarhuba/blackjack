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
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        playerCards.setMaxHeight(250);
        dealerCards.setMaxHeight(250);
        whoWins = new Label("Wygrał...");
        whoWins.setAlignment(Pos.CENTER);
        whoWins.setFont(Font.font(25));
        whoWins.setStyle("-fx-background-color: #C9FFE5;");



        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.version");
        System.out.println("jdk:" + javafxVersion + " fx:" + javafxVersion);

        ImageView imageback = new ImageView(IMG_PATH + "/table.png");
        imageback.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.setVgap(10);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);

        Button drawCardButton = new Button("Wyłóż kolejną kartę");
        Button enoughtCardButton = new Button("Kończę kolejkę");
        Button newGameButton = new Button("Nowa gra");
        Button endGameButton = new Button("Koniec gry");
        Text playerInfo = new Text("TESTTESTTESTTESTTESTTESTTEST");
        Text playerInfo2 = new Text("TESTTESTTESTTESTTESTTESTTEST");


        grid.add(whoWins,0,0);
        grid.add(playerCards, 0, 1);
        grid.add(playerInfo,0,2);
        grid.add(dealerCards, 0, 3);
        grid.add(playerInfo2,0,4);

        grid.add(drawCardButton, 0, 5);
        grid.add(enoughtCardButton, 0, 6);
        grid.add(newGameButton, 0, 7);
        grid.add(endGameButton, 0, 8);

        Scene scene = new Scene(grid, 1597, 898, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BlackJack");
        primaryStage.setResizable(false);
        primaryStage.show();

        GameController gc = new GameController();
        drawCardButton.setOnAction(e -> gc.playerMove());
        enoughtCardButton.setOnAction(e -> gc.discardMove());
        newGameButton.setOnAction(e -> gc.newGame());
        endGameButton.setOnAction(e -> gc.endGame());
        gc.startGame();
    }
}