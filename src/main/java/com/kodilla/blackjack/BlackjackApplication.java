package com.kodilla.blackjack;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BlackjackApplication extends Application {

    private Image rawImageBack = new Image("file:src/main/resources/table.png");
    private Image card = new Image("file:src/main/resources/cards/PNG-cards-1.3/2_of_clubs.png");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ImageView imageback = new ImageView(rawImageBack);
        imageback.setPreserveRatio(true);
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, false, false, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback.getImage(), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(card);
        img.setSmooth(true);
        cards.getChildren().add(img);

        grid.add(cards, 0, 0, 3, 1);

        Scene scene = new Scene(grid, 1597, 898, Color.BLACK);
        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Koniec działania aplikacji");
        super.stop();
    }
}