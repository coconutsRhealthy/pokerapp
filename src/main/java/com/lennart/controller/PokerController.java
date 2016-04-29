package com.lennart.controller;

import java.util.ArrayList;
import java.util.List;

import com.lennart.model.Card;
import com.lennart.model.CardWrapper;
import com.lennart.model.ListOfAllStartCards;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PokerController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String renderPreflopPage(Model model) throws Exception {
        ListOfAllStartCards listOfAllStartCardsd = new ListOfAllStartCards();
        List<String> allStartCards = listOfAllStartCardsd.getAllStartCards();
        model.addAttribute("allStartCards", allStartCards);

        Card startCard1 = new Card();
        Card startCard2 = new Card();
        ArrayList<Card> startHand = new ArrayList<Card>();
        startHand.add(startCard1);
        startHand.add(startCard2);

        CardWrapper cardWrapper = new CardWrapper();
        cardWrapper.setListOfCards(startHand);
        model.addAttribute("cardWrapper", cardWrapper);
        return "index";
    }

    @RequestMapping(value = "/flop", method = RequestMethod.POST)
    public String goToFlop(@ModelAttribute("cardWrapper") CardWrapper cardWrapper) {
        ArrayList<Card> chosenStartCards = cardWrapper.getListOfCards();

        System.out.println("value of first card: " + chosenStartCards.get(0).getCardValue());
        System.out.println("suit of first card: " + chosenStartCards.get(0).getCardSuit());
        System.out.println();
        System.out.println("value of second card: "+ chosenStartCards.get(1).getCardValue());
        System.out.println("suit of second card: " + chosenStartCards.get(1).getCardSuit());
        return "flop";
    }
}
