package com.energy.simulation.devicemanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/device-manager/api/welcome")
@RestController
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "Welcome to device manager!!";
    }
}
