package com.example.qyy.controller;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Index {

    @RequestMapping("/home")
    String home() {
        return "Hello World!";
    }
}
