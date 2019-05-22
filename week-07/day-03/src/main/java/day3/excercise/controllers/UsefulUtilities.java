package day3.excercise.controllers;

import day3.excercise.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilities {

    @Autowired
    UtilityService utilityService;

    @RequestMapping("/useful/colored")
    public String colored (Model model) {

        model.addAttribute("color", utilityService.randomColor());
        return "index";
    }

    @RequestMapping("/useful/email")
    public String validator(@RequestParam String email, Model model) {

        if (utilityService.validateEmail(email)) {
            model.addAttribute("email","<font color=\"green\">" + email + " is valid email address</font>");
        } else {
            model.addAttribute("email","<font color=\"red\">" + email + " is not valid email address</font>");
        }
        return "email";
    }
}
