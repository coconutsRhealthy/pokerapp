package com.lennart.model;

/**
 * Created by lennart on 17-4-16.
 */

import com.fasterxml.jackson.annotation.JsonView;
import com.lennart.jsonview.Views;

public class Card {

    @JsonView(Views.Public.class)
    private int cardValue;

    @JsonView(Views.Public.class)
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
    //test for commit
}
