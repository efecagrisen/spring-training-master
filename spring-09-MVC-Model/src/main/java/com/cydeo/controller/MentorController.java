package com.cydeo.controller;

import com.cydeo.enums.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MentorController {

    @RequestMapping("/mentor")
    public String springMvcPracticeTask(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("Efe","Şen", Gender.MALE,34));
        mentorList.add(new Mentor("Sezai","Şen", Gender.MALE,9));
        mentorList.add(new Mentor("Ensar","Şen", Gender.MALE,4));

        model.addAttribute("mentors",mentorList);

//        Mentor mentor1 = new Mentor("Efe","Şen", Gender.MALE,34);
//        model.addAttribute("mentor1",mentor1);
//        Mentor mentor2 = new Mentor("Sezai","Şen", Gender.MALE,9);
//        model.addAttribute("mentor2",mentor2);
//        Mentor mentor3 = new Mentor("Ensar","Şen", Gender.MALE,4);
//        model.addAttribute("mentor3",mentor3);

        return "mentor/mentor";

    }

}
