package com.js.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HCtl {
    @RequestMapping("/")
    public String hello(String name){
        return "hello";
    }
}
