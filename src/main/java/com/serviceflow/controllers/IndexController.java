package com.serviceflow.controllers;

import com.serviceflow.model.FizzBuzzComponent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by egucer on 01-May-17.
 */

@Controller
public class IndexController {

    @RequestMapping ("/")
    public String index(Model model) {
        model.addAttribute("fizzBuzz", new FizzBuzzComponent());
        return "index";
    }
}
