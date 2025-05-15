package com.vicky.josefa_pin_site.controller;

import com.vicky.josefa_pin_site.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hello(name);
    }
}
