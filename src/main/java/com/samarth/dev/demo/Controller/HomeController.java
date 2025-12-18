package com.samarth.dev.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

//basic example
///@Restcontroller return data (Json) @controller returns the files
@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to Home server";
    }

    @RequestMapping("/about")
    public String about() {
        return "Welcome to About server";
    }
    
}
