package net.jserrano.portfolioapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {

    @GetMapping("/api")
    public void api() {
        System.out.println("Connected");
    }
}
