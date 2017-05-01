package com.serviceflow.controllers;

import com.serviceflow.model.FizzBuzzComponent;
import com.serviceflow.utils.GameUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by egucer on 01-May-17.
 */

@Controller
public class GameController {

    @RequestMapping (value = "/form" , method = RequestMethod.POST)
    public String submitNumber(@ModelAttribute FizzBuzzComponent fizzBuzzComponent, Model model) {
        fizzBuzzComponent.setResult(GameUtils.calculateFizzBuzz(fizzBuzzComponent.getFizzBuzzNumber()));
        model.addAttribute("fizzBuzz", fizzBuzzComponent);
        return "index";
    }

}
