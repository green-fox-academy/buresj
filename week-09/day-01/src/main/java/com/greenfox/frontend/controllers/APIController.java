package com.greenfox.frontend.controllers;

import com.greenfox.frontend.models.Doubling;
import com.greenfox.frontend.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    @GetMapping("/greeting")
    public Object greet(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {

        if (name != null && title != null) {
            Greeting greet = new Greeting(name, title);
            return greet;

        } else if (title == null) {
            Error error = new Error("Please provide title!");
            return error;
        } else if (name == null) {
            Error error = new Error("Please provide name!");
            return error;
        } else {
            Error error = new Error("Please provide name and title!");
            return error;
        }
    }

    @GetMapping("/doubling")
    public Object doubling(@RequestParam(required = false) Integer input) {
        if (input != null) {
            Doubling doub = new Doubling(input);
            return doub;
        } else {
            return new Error("Please provide an input!");
        }
    }
}


