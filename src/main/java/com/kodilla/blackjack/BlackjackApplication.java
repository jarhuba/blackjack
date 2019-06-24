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

    public static final String IMG_PATH = "file:src/main/resources";
    private Image rawImageBack = new Image(IMG_PATH+"/table.png");
    private Image card = new Image(IMG_PATH+ "/cards/2_of_clubs.png");
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
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);
        grid.setGridLinesVisible(true);

        ImageView img = new ImageView(card);
        img.setSmooth(true);
        img.setFitHeight(300.0);
        img.setPreserveRatio(true);

        cards.getChildren().add(img);

        grid.add(img, 0, 0, 1, 1);

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