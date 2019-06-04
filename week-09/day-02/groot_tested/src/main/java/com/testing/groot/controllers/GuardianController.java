package com.testing.groot.controllers;

import com.testing.groot.models.GrootResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping("/groot")
    public ResponseEntity<GrootResponse> groot(@RequestParam String message) {

        if (message != null) {
                  return new ResponseEntity<>(new GrootResponse(message), HttpStatus.OK);
        }
        return new ResponseEntity<>(new GrootResponse(), HttpStatus.BAD_REQUEST);
    }
}
