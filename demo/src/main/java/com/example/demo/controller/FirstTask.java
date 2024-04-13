package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstTask {
    @RequestMapping("/task1")
    public String hello(){
        return "task1";
    }
}
