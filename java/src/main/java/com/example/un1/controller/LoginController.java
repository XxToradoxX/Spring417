package com.example.un1.controller;

import com.example.un1.config.MyLocaleResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String Login(){
        return "/login";
    }
}
