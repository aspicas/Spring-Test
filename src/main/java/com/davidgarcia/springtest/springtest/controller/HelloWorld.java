package com.davidgarcia.springtest.springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {

    @RequestMapping("")
    public String index() {
        return "Hello World";
    }
}
