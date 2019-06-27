package com.kodilla.blackjack;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BlackjackApplication extends Application {

    public static final String IMG_PATH = "file:src/main/resources";
    public static FlowPane playerCards = new FlowPane(Orientation.VERTICAL);
    public static FlowPane dealerCards = new FlowPane(Orientation.VERTICAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView imageback = new ImageView(IMG_PATH+"/table.png");
        imageback.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);

        grid.add(playerCards, 0, 0, 1 ,1);
        grid.add(dealerCards, 0, 1, 1, 1);
        //grid.add(drawCard,0,2,1,1);
        //Button drawCard = new Button("Pobierz kartę");

        Scene scene = new Scene(grid, 1597, 898, Color.BLACK);
        primaryStage.setScene(scene);
        primaryStage.setTitle("BlackJack");
        primaryStage.setResizable(false);
        primaryStage.show();

        GameController gc = new GameController();
        gc.startGame();
        gc.playerMove();

    }

    @Override
    public void stop() throws Exception {
        System.out.println("Koniec działania aplikacji");
        super.stop();
    }
}