package com.example.demo.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    
    @GetMapping("/test")
    public String testRest(){
        return "Login";
    }
    
    @GetMapping("/test2")
    public String testRest2(){
        return "ToDoList";
    }
    
}
