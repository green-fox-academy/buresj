package com.greenfoxacademy.springstart.controllers;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam String name) {
        return new Greeting(counter.incrementAndGet(), "Hello " + name);
    }
}
