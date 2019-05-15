package com.greenfoxacademy.springstart.controllers;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam String name) {
        Greeting greets = new Greeting(counter.incrementAndGet(), "Hello " + name);
        return greets.getContent() +", You have visited this page " + greets.getId() + " times.";
    }
}
