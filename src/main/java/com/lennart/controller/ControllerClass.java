package com.lennart.controller;

import java.util.List;

import com.lennart.beans.Eijers;
import com.lennart.beans.StartHands;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;


@Controller
public class ControllerClass {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(Model model) throws Exception {
        StartHands startHand = new StartHands();
        List<String> startCard = startHand.getStartCard();

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("startCard", startCard);

        Eijers eije = new Eijers();

        model.addAttribute("userForm", eije);

        return mav;
        //test
    }

    @RequestMapping(value = "/postStartHand", method = RequestMethod.POST)
    public ModelAndView postStartHand(@ModelAttribute("userForm") Eijers eije) {
        ModelAndView mav = new ModelAndView("index");

        System.out.println(eije.getYourStartHand());




        //System.out.println(request.getParameter("age"));
//hoi
        return mav;
    }
}
