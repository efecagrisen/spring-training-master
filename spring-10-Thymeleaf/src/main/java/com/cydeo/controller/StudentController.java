package com.cydeo.controller;

import com.cydeo.bootstrap.DateGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

                                                      //class level  /  method level
    @RequestMapping("/register") //localhost:8080   /student      /  register
    public String register(Model model){

        model.addAttribute("students", DateGenerator.createStudent());

        return "student/register";
    }

    @RequestMapping("/welcome") //localhost:8080/student/welcome
    public String welcome(@RequestParam String name){
        System.out.println(name);
        return "student/welcome";
    }

}
