package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register") //localhost:8080/mentor/register

    public String register(){
        return "mentor/mentor-register";
    }


}
