package com.example.qyy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exception implements ErrorController {

    private static final String path_default = "/error";

    @Override
    public String getErrorPath() {
        return path_default;
    }

    @RequestMapping(value = path_default)
    public String error() {
        return "Ops, you seem have encounter an fatal error.<br>" +
                "But don't worry, we have already record it.<br>" +
                "The service will recover as soon as possible. :)";
    }

}
