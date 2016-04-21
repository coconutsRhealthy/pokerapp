package com.lennart.controller;

import java.util.List;

import com.lennart.beans.StartHands;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;


@Controller
public class ControllerClass {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index() throws Exception {
        StartHands startHand = new StartHands();
        List<String> startCard = startHand.getStartCard();

        ModelAndView mav = new ModelAndView("index");
        mav.addObject("startCard", startCard);
        return mav;
        //test
    }

    @RequestMapping(value = "/postStartHand", method = RequestMethod.POST)
    public ModelAndView postStartHand(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Add book to DB successfully");
        System.out.println(request.getParameter("age"));
//hoi
        return mav;
    }
}
