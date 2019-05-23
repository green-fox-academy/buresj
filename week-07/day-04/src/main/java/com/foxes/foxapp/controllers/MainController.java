package com.foxes.foxapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {

    @RequestMapping(path = "/")
    public String show(Model model) {
        return "index";
    }


    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String loginGet(@RequestParam(required = false) String name) {
        return "redirect:/index" + name;
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String loginPost(@RequestParam(required = false) String name) {
        return "redirect:/index" + name;
    }

}
