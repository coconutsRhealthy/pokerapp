package com.lennart.model;

/**
 * Created by lennart on 17-4-16.
 */
public class Card {
    private int cardValue;
    private char cardSuit;

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public char getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(char cardSuit) {
        this.cardSuit = cardSuit;
    }
}
