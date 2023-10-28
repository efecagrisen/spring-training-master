package com.cydeo.controller;

import com.cydeo.dto.CourseDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping
    @ResponseBody
    public List<CourseDTO> getAllcourses(){

        return

    }



}
