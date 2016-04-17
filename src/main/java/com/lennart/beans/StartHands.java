package com.lennart.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lennart on 4-4-16.
 */
public class StartHands {

    private List<String> startCard = new ArrayList<String>();

    public StartHands () {
        startCard.add("As");
        startCard.add("Ac");
        startCard.add("Ad");
        startCard.add("Ah");

        startCard.add("Ks");
        startCard.add("Kc");
        startCard.add("Kd");
        startCard.add("Kh");

        startCard.add("Qs");
        startCard.add("Qc");
        startCard.add("Qd");
        startCard.add("Qh");

        startCard.add("Js");
        startCard.add("Jc");
        startCard.add("Jd");
        startCard.add("Jh");

        startCard.add("Ts");
        startCard.add("Tc");
        startCard.add("Td");
        startCard.add("Th");

        startCard.add("9s");
        startCard.add("9c");
        startCard.add("9d");
        startCard.add("9h");

        startCard.add("8s");
        startCard.add("8c");
        startCard.add("8d");
        startCard.add("8h");

        startCard.add("7s");
        startCard.add("7c");
        startCard.add("7d");
        startCard.add("7h");

        startCard.add("6s");
        startCard.add("6c");
        startCard.add("6d");
        startCard.add("6h");

        startCard.add("5s");
        startCard.add("5c");
        startCard.add("5d");
        startCard.add("5h");

        startCard.add("4s");
        startCard.add("4c");
        startCard.add("4d");
        startCard.add("4h");

        startCard.add("3s");
        startCard.add("3c");
        startCard.add("3d");
        startCard.add("3h");

        startCard.add("2s");
        startCard.add("2c");
        startCard.add("2d");
        startCard.add("2h");
    }

    public List<String> getStartCard() {
        return startCard;
    }

    public void setStartCard(List<String> startCard) {
        this.startCard = startCard;
    }
}
