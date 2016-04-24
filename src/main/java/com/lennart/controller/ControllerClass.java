package com.lennart.controller;

import java.util.ArrayList;
import java.util.List;

import com.lennart.beans.CardWrapper;
import com.lennart.beans.Eijers;
import com.lennart.beans.StartHands;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerClass {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(Model model) throws Exception {
        StartHands startHand = new StartHands();
        List<String> startCard = startHand.getStartCard();

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("startCard", startCard);

        //Eijers eije = new Eijers();

        Eijers eije1 = new Eijers();
        Eijers eije2 = new Eijers();
        ArrayList<Eijers> hmm = new ArrayList<Eijers>();
        hmm.add(eije1);
        hmm.add(eije2);

        CardWrapper cardWrapper = new CardWrapper();

        cardWrapper.setEijersList(hmm);

        model.addAttribute("userForm", cardWrapper);
        //model.addAttribute("userForm", eije);

        return mav;
        //test

    }

    @RequestMapping(value = "/postStartHand", method = RequestMethod.POST)
    public ModelAndView postStartHand(@ModelAttribute("userForm") CardWrapper cardWrapper) {
        ModelAndView mav = new ModelAndView("index");

        ArrayList<Eijers> listInSecondMethod = cardWrapper.getEijersList();

        System.out.println("value of first card: " + listInSecondMethod.get(0).getCardValue());
        System.out.println("suit of first card: " + listInSecondMethod.get(0).getCardSuit());

        System.out.println();

        System.out.println("value of second card: "+ listInSecondMethod.get(1).getCardValue());
        System.out.println("suit of second card: " + listInSecondMethod.get(1).getCardSuit());

        //System.out.println()

        //System.out.println(eije.getCardValue());




        //System.out.println(request.getParameter("age"));
//hoi
        return mav;
    }
}
