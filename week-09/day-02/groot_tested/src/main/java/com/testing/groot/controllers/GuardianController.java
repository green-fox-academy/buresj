package com.testing.groot.controllers;

import com.testing.groot.models.Arrow;
import com.testing.groot.models.Cargo;
import com.testing.groot.models.CargoStatus;
import com.testing.groot.models.GrootResponse;
import com.testing.groot.services.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    private CargoService cargo;

    @Autowired
    public GuardianController(CargoService cargo) {
        this.cargo = cargo;
    }

    @GetMapping("/groot")
    public ResponseEntity<GrootResponse> askGroot(@RequestParam (required = false) String message) {
        if (message != null) {
                  return new ResponseEntity<>(new GrootResponse(message), HttpStatus.OK);
        }
        return new ResponseEntity<>(new GrootResponse(), HttpStatus.BAD_REQUEST);
    }

    @GetMapping("/yondu")
    public ResponseEntity<Arrow> fireArrow(@RequestParam (required = false) double distance, @RequestParam (required = false) double time) {
        return new ResponseEntity<>(new Arrow(distance, time),HttpStatus.OK);
    }

    @GetMapping("/rocket")
    public ResponseEntity<Cargo> displayShip() {
        return new ResponseEntity<>(new Cargo(), HttpStatus.OK);
    }

    @GetMapping("/rocket/fill")
    public CargoStatus fillShip(@RequestParam (required = false) double caliber, @RequestParam(required = false) int amount) {

        cargo.fill(caliber,amount);

        return cargo.getStatus();
    }
}
