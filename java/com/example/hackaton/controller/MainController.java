package com.example.hackaton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainload() {
        return "main.html";
    }
    @GetMapping("/login")
    public String login(){
        return "login.html";
    }
    @GetMapping("/signup")
    public String signup(){
        return "signup.html";
    }
    @GetMapping("/health")
    public String health(){
        return "health.html";
    }
    @GetMapping("/medicine")
    public String medicine(){
        return "medicine.html";
    }
}
