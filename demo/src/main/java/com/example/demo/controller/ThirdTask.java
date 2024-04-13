package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class ThirdTask {
    private final UserRepository userRepository;

    @GetMapping("/task3")
    public String getUsers(Model model){
        model.addAttribute("users", userRepository.getUsers());
        return "task3";
    }

    @PostMapping("/task3")
    public String registerUser(@ModelAttribute("user") User user, Model model){
        userRepository.addUser(user);
        model.addAttribute("users", userRepository.getUsers());
        return "task3";

    }
}
