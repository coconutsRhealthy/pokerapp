package com.lennart.controller;

import java.util.ArrayList;
import java.util.List;
import com.lennart.model.Card;
import com.lennart.model.CardWrapper;
import com.lennart.model.ListOfAllStartCards;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



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
    public String goToFlop(@ModelAttribute("cardWrapper") CardWrapper cardWrapper, Model model) {
        ArrayList<Card> chosenStartCards = cardWrapper.getListOfCards();

        System.out.println("value of first card: " + chosenStartCards.get(0).getCardValue());
        System.out.println("suit of first card: " + chosenStartCards.get(0).getCardSuit());
        System.out.println();
        System.out.println("value of second card: "+ chosenStartCards.get(1).getCardValue());
        System.out.println("suit of second card: " + chosenStartCards.get(1).getCardSuit());

        ListOfAllStartCards listOfAllStartCardsd = new ListOfAllStartCards();
        List<String> allStartCards = listOfAllStartCardsd.getAllStartCards();
        model.addAttribute("allStartCards", allStartCards);

        model.addAttribute("cardWrapper", cardWrapper);



        return "flop";
    }

    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    public @ResponseBody List<Card> getTime() {
        Card testCard = new Card();
        testCard.setCardSuit('d');
        testCard.setCardValue(9);

        Card testCard2 = new Card();
        testCard2.setCardSuit('c');
        testCard2.setCardValue(8);

        List<Card> eijemmm = new ArrayList<Card>();
        eijemmm.add(testCard);
        eijemmm.add(testCard2);

        System.out.println("cockboy");
        return eijemmm;
    }


    @RequestMapping(value = "testje", method = RequestMethod.POST)
    public @ResponseBody Card ajaxtestpost(@RequestBody String string) {

        System.out.println(string);
        Card eije = new Card();

        return eije;
    }

}
