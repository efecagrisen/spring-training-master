package com.cydeo.controller;

import com.cydeo.bootstrap.DateGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {

                                                      //class level  /  method level
//    @RequestMapping("/register") //localhost:8080   /student      /  register
//    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @GetMapping("/register") //same as above
    public String register(Model model){

        model.addAttribute("students", DateGenerator.createStudent());

        return "student/register";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST) //localhost:8080/student/welcome
    @PostMapping("/welcome") //same as above
    public String welcome(@RequestParam String name){
        System.out.println(name);
        return "student/welcome";
    }

}
