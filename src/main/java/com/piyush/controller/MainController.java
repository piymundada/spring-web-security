package com.piyush.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping(value = "/greet")
    public String greet() {
        return "<h1> Hello World! </h1>";
    }

    @GetMapping(value = "/admin")
    public String admin() {
        return "<h1> Hello Admin </h1>";
    }

    @GetMapping(value = "/home")
    public String home() {
        return "<h1> Home Page </h1>";
    }
}
