package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloToAllWorld {

    AtomicLong counter = new AtomicLong();

    @RequestMapping("/web/greeting")
    public String greeting(@RequestParam String name, Model model) {
        Greeting greets = new Greeting(counter.incrementAndGet(), name);
        ProduceHello hello = new ProduceHello();

        model.addAttribute("color", hello.getColor());
        model.addAttribute("size", hello.getSize());
        model.addAttribute("hello", hello.getHellos(counter.intValue()));
        model.addAttribute("name", name);

        return "greeting";
    }
}
