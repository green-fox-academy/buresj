package day3.excercise.controllers;

import day3.excercise.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilities {

    private UtilityService utilityService;

    @Autowired
    public UsefulUtilities(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @RequestMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "index";
    }

    @RequestMapping("/useful/email")
    public String validator(@RequestParam String email, Model model) {

        if (utilityService.validateEmail(email)) {
            model.addAttribute("email", "<font color=\"green\">" + email + " is valid email address</font>");
        } else {
            model.addAttribute("email", "<font color=\"red\">" + email + " is not valid email address</font>");
        }
        return "email";
    }

    @RequestMapping("/useful/encode")
    public String encoder(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("text", utilityService.caesar(text, number));
        return "encoded";
    }

    @RequestMapping("/useful/decode")
    public String decoder(@RequestParam String text, @RequestParam int number, Model model) {
        model.addAttribute("text", utilityService.caesar(text, (number * -1)));
        return "encoded";
    }
}
