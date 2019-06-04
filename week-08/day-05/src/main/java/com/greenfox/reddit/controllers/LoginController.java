package com.greenfox.reddit.controllers;

import com.greenfox.reddit.entities.User;
import com.greenfox.reddit.services.UserService;
import com.greenfox.reddit.services.UserServiceImpl;
import com.greenfox.reddit.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    private UserRepo userRepo;
    private UserService userService;

    @Autowired
    public LoginController (UserRepo userRepo, UserService userService) {
        this.userRepo = userRepo;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/create")
    public String create(Model model, @ModelAttribute User user) {
        userRepo.save(user);
        if (!userService.test(user)) {
            userRepo.save(user);
            return "redirect:/login";
        }
        model.addAttribute("error","Existing user!");
        return "errors";
    }

    @PostMapping("/test")
    public String use( @ModelAttribute User user) {
        if (userService.test(user)) {
            return "redirect:/?username=" + user.getUsername();
        }
        return "redirect:/login";
    }
}
