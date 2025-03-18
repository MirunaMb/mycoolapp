package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose a new endpoint for greeting
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }
    //expose a new endpoint for workout
    @GetMapping("/workout")
    public String doSomeWork(){
        return "Hips thrust";
    }

    //expose a new endpoint for fortune
    @GetMapping("/fortune")
    public String getLucky(){
        return "You won a 1000 dollars!";
    }
}
