package com.lennart.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lennart on 4-4-16.
 */
public class ListOfAllStartCards {

    private List<String> allStartCards = new ArrayList<String>();

    public ListOfAllStartCards() {
        allStartCards.add("As");
        allStartCards.add("Ac");
        allStartCards.add("Ad");
        allStartCards.add("Ah");

        allStartCards.add("Ks");
        allStartCards.add("Kc");
        allStartCards.add("Kd");
        allStartCards.add("Kh");

        allStartCards.add("Qs");
        allStartCards.add("Qc");
        allStartCards.add("Qd");
        allStartCards.add("Qh");

        allStartCards.add("Js");
        allStartCards.add("Jc");
        allStartCards.add("Jd");
        allStartCards.add("Jh");

        allStartCards.add("Ts");
        allStartCards.add("Tc");
        allStartCards.add("Td");
        allStartCards.add("Th");

        allStartCards.add("9s");
        allStartCards.add("9c");
        allStartCards.add("9d");
        allStartCards.add("9h");

        allStartCards.add("8s");
        allStartCards.add("8c");
        allStartCards.add("8d");
        allStartCards.add("8h");

        allStartCards.add("7s");
        allStartCards.add("7c");
        allStartCards.add("7d");
        allStartCards.add("7h");

        allStartCards.add("6s");
        allStartCards.add("6c");
        allStartCards.add("6d");
        allStartCards.add("6h");

        allStartCards.add("5s");
        allStartCards.add("5c");
        allStartCards.add("5d");
        allStartCards.add("5h");

        allStartCards.add("4s");
        allStartCards.add("4c");
        allStartCards.add("4d");
        allStartCards.add("4h");

        allStartCards.add("3s");
        allStartCards.add("3c");
        allStartCards.add("3d");
        allStartCards.add("3h");

        allStartCards.add("2s");
        allStartCards.add("2c");
        allStartCards.add("2d");
        allStartCards.add("2h");
    }

    public List<String> getAllStartCards() {
        return allStartCards;
    }

    public void setAllStartCards(List<String> allStartCards) {
        this.allStartCards = allStartCards;
    }
}
