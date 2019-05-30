package com.greenfox.todomysql.controllers;

import com.greenfox.todomysql.entities.User;
import com.greenfox.todomysql.models.Selector;
import com.greenfox.todomysql.models.Validator;
import com.greenfox.todomysql.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private UserRepo userRepo;
    private Validator validator;
    private Selector selector;

    @Autowired
    public LoginController (Validator validator, Selector selector, UserRepo userRepo) {
        this.validator = validator;
        this.selector = selector;
        this.userRepo = userRepo;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute User user) {
        if (!validator.test(user)) {
            userRepo.save(user);
            return "redirect:/login";
        }
        model.addAttribute("error","Existing user!");
        return "errors";
    }

    @PostMapping("/test")
    public String use( @ModelAttribute User user) {
        if (validator.test(user)) {
            return "redirect:/?user=" + selector.userId(user);
        }
        return "redirect:/login";
    }
}
