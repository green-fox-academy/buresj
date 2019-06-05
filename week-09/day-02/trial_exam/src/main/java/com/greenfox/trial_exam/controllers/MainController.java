package com.greenfox.trial_exam.controllers;

import com.greenfox.trial_exam.models.URL;
import com.greenfox.trial_exam.services.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private URLService service;

    @Autowired
    public MainController(URLService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String renderMainPage() {
        return "index";
    }

    @PostMapping("/save-link")
    public String saveLink(@ModelAttribute URL url){
        service.save(url);

    }
}
