package com.foxes.foxapp.controllers;

import com.foxes.foxapp.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class MainController {


    List<Fox> foxes;

    public MainController() {
        this.foxes =  new ArrayList<>(Arrays.asList(new Fox("Foxi", "pizza","jumps")));
    }

    @RequestMapping(path = "/")
    public String show(Model model, @RequestParam(required = false) String name) {

        if(name.equals(foxes.get(0).getName())) {
            model.addAttribute("name", foxes.get(0).getName());
            model.addAttribute("food", foxes.get(0).getDrink());
            model.addAttribute("drink", foxes.get(0).getFood());
        }
        return "index";
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String loginGet() {
        return "login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String loginPost(@RequestParam(required = false) String name) {

        return "redirect:/?name=" + name;
    }

}