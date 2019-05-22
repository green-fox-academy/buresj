package day3.excercise.controllers;

import day3.excercise.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsefulUtilities {

    @Autowired
    UtilityService utilityService;

    @RequestMapping("/useful/colored")
    public String colored (Model model) {

        model.addAttribute("color", utilityService.randomColor());

        return "index";
    }
}
