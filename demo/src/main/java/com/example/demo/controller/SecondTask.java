package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class SecondTask {
    Random random = new Random();
    @GetMapping("/task2")
    public String random(Model model){
        int number1 = random.nextInt(231);
        int number2 = random.nextInt(123);
        int sum = number1 + number2;
        model.addAttribute("number1", number1);
        model.addAttribute("number2", number2);
        model.addAttribute("sum", sum);
        return "task2";
    }
}
