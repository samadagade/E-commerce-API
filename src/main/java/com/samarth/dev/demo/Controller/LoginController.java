package com.samarth.dev.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//basic example
@RestController
public class LoginController {
    @RequestMapping("/login")
    public String Login() {
        return "Welcome To Login server";
    }
    
}
