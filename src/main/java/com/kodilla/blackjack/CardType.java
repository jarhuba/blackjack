package com.kodilla.blackjack;

import javafx.scene.image.ImageView;
import static com.kodilla.blackjack.BlackjackApplication.IMG_PATH;

public enum CardType {

    DWOJKA_CLUBS(2, "dwójka", new ImageView(IMG_PATH + "/cards/2_of_clubs.png")),
    TROJKA_CLUBS(3, "trójka", new ImageView(IMG_PATH + "/cards/3_of_clubs.png")),
    CZWORKA_CLUBS(4, "czwórka", new ImageView(IMG_PATH + "/cards/4_of_clubs.png")),
    PIATKA_CLUBS(5, "piątka", new ImageView(IMG_PATH + "/cards/5_of_clubs.png")),
    SZOSTKA_CLUBS(6, "szóstka", new ImageView(IMG_PATH + "/cards/6_of_clubs.png")),
    SIODEMKA_CLUBS(7, "siódemka", new ImageView(IMG_PATH + "/cards/7_of_clubs.png")),
    OSEMKA_CLUBS(8, "ósemka", new ImageView(IMG_PATH + "/cards/8_of_clubs.png")),
    DZIEWIATKA_CLUBS(9, "dziewiątka", new ImageView(IMG_PATH + "/cards/9_of_clubs.png")),
    DZIESIATKA_CLUBS(10, "dziesiątka", new ImageView(IMG_PATH + "/cards/10_of_clubs.png")),
    WALET_CLUBS(10, "walet", new ImageView(IMG_PATH + "/cards/jack_of_clubs.png")),
    DAMA_CLUBS(10, "dama", new ImageView(IMG_PATH + "/cards/queen_of_clubs.png")),
    KROL_CLUBS(10, "król", new ImageView(IMG_PATH + "/cards/king_of_clubs.png")),
    AS_CLUBS(0, "as", new ImageView(IMG_PATH + "/cards/ace_of_clubs.png")),

    DWOJKA_DIAMONDS(2, "dwójka", new ImageView(IMG_PATH + "/cards/2_of_diamonds.png")),
    TROJKA_DIAMONDS(3, "trójka", new ImageView(IMG_PATH + "/cards/3_of_diamonds.png")),
    CZWORKA_DIAMONDS(4, "czwórka", new ImageView(IMG_PATH + "/cards/4_of_diamonds.png")),
    PIATKA_DIAMONDS(5, "piątka", new ImageView(IMG_PATH + "/cards/5_of_diamonds.png")),
    SZOSTKA_DIAMONDS(6, "szóstka", new ImageView(IMG_PATH + "/cards/6_of_diamonds.png")),
    SIODEMKA_DIAMONDS(7, "siódemka", new ImageView(IMG_PATH + "/cards/7_of_diamonds.png")),
    OSEMKA_DIAMONDS(8, "ósemka", new ImageView(IMG_PATH + "/cards/8_of_diamonds.png")),
    DZIEWIATKA_DIAMONDS(9, "dziewiątka", new ImageView(IMG_PATH + "/cards/9_of_diamonds.png")),
    DZIESIATKA_DIAMONDS(10, "dziesiątka", new ImageView(IMG_PATH + "/cards/10_of_diamonds.png")),
    WALET_DIAMONDS(10, "walet", new ImageView(IMG_PATH + "/cards/jack_of_diamonds.png")),
    DAMA_DIAMONDS(10, "dama", new ImageView(IMG_PATH + "/cards/queen_of_diamonds.png")),
    KROL_DIAMONDS(10, "król", new ImageView(IMG_PATH + "/cards/king_of_diamonds.png")),
    AS_DIAMONDS(0, "as", new ImageView(IMG_PATH + "/cards/ace_of_diamonds.png")),

    DWOJKA_HEARTS(2, "dwójka", new ImageView(IMG_PATH + "/cards/2_of_hearts.png")),
    TROJKA_HEARTS(3, "trójka", new ImageView(IMG_PATH + "/cards/3_of_hearts.png")),
    CZWORKA_HEARTS(4, "czwórka", new ImageView(IMG_PATH + "/cards/4_of_hearts.png")),
    PIATKA_HEARTS(5, "piątka", new ImageView(IMG_PATH + "/cards/5_of_hearts.png")),
    SZOSTKA_HEARTS(6, "szóstka", new ImageView(IMG_PATH + "/cards/6_of_hearts.png")),
    SIODEMKA_HEARTS(7, "siódemka", new ImageView(IMG_PATH + "/cards/7_of_hearts.png")),
    OSEMKA_HEARTS(8, "ósemka", new ImageView(IMG_PATH + "/cards/8_of_hearts.png")),
    DZIEWIATKA_HEARTS(9, "dziewiątka", new ImageView(IMG_PATH + "/cards/9_of_hearts.png")),
    DZIESIATKA_HEARTS(10, "dziesiątka", new ImageView(IMG_PATH + "/cards/10_of_hearts.png")),
    WALET_HEARTS(10, "walet", new ImageView(IMG_PATH + "/cards/jack_of_hearts.png")),
    DAMA_HEARTS(10, "dama", new ImageView(IMG_PATH + "/cards/queen_of_hearts.png")),
    KROL_HEARTS(10, "król", new ImageView(IMG_PATH + "/cards/king_of_hearts.png")),
    AS_HEARTS(0, "as", new ImageView(IMG_PATH + "/cards/ace_of_hearts.png")),

    DWOJKA_SPADES(2, "dwójka", new ImageView(IMG_PATH + "/cards/2_of_spades.png")),
    TROJKA_SPADES(3, "trójka", new ImageView(IMG_PATH + "/cards/3_of_spades.png")),
    CZWORKA_SPADES(4, "czwórka", new ImageView(IMG_PATH + "/cards/4_of_spades.png")),
    PIATKA_SPADES(5, "piątka", new ImageView(IMG_PATH + "/cards/5_of_spades.png")),
    SZOSTKA_SPADES(6, "szóstka", new ImageView(IMG_PATH + "/cards/6_of_spades.png")),
    SIODEMKA_SPADES(7, "siódemka", new ImageView(IMG_PATH + "/cards/7_of_spades.png")),
    OSEMKA_SPADES(8, "ósemka", new ImageView(IMG_PATH + "/cards/8_of_spades.png")),
    DZIEWIATKA_SPADES(9, "dziewiątka", new ImageView(IMG_PATH + "/cards/9_of_spades.png")),
    DZIESIATKA_SPADES(10, "dziesiątka", new ImageView(IMG_PATH + "/cards/10_of_spades.png")),
    WALET_SPADES(10, "walet", new ImageView(IMG_PATH + "/cards/jack_of_spades.png")),
    DAMA_SPADES(10, "dama", new ImageView(IMG_PATH + "/cards/queen_of_spades.png")),
    KROL_SPADES(10, "król", new ImageView(IMG_PATH + "/cards/king_of_spades.png")),
    AS_SPADES(0, "as", new ImageView(IMG_PATH + "/cards/ace_of_spades.png"));

    private int value;
    private String cardName;
    private ImageView cardImage;

    CardType(int value, String cardName, ImageView cardImage) {
        this.value = value;
        this.cardName = cardName;
        this.cardImage = cardImage;
    }

    public int getValue() {
        return value;
    }

    public String getCardName() {
        return cardName;
    }

    public ImageView getCardImage() {
        return cardImage;
    }
}
