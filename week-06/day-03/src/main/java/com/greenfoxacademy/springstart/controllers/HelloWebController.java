package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {

    AtomicLong counter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        Greeting greets = new Greeting(counter.incrementAndGet(), name);

        model.addAttribute("id", greets.getId());
        model.addAttribute("name", name);

        return "greeting";
    }
}
