package com.foxes.foxapp.controllers;

import com.foxes.foxapp.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class MainController {


    String user;
    List<Fox> foxes;

    public MainController() {
        this.foxes =  new ArrayList<>(Arrays.asList(new Fox("Foxi", "lemons","lemonade")));
    }

    @GetMapping("/")
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
    public String handleName(@RequestParam(required = false) String name) {
        name = user;
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nav")
    public String openNutrition() {
        return "redirect:/nutrition/?name=" + user;
    }

    @GetMapping("/nutrition/")
    public String changeNutrition (Model model, @RequestParam String name){
        return "nutrition";
    }

    @GetMapping("/change-nutrition/")
    public String changeNutrition (Model model, @RequestParam String name){


        return "nutrition";
    }

}
