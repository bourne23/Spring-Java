package com.foxborn.controller;

import com.foxborn.enums.Gender;
import com.foxborn.model.Instructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/instructor")
public class InstructorController {

    @RequestMapping("list")   // localhost:8080/instructor/list
    public String showTable(Model model){

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor("Mike","Smith",45, Gender.MALE));
        instructorList.add(new Instructor("Tom","Hanks",65, Gender.MALE));
        instructorList.add(new Instructor("Amy","Bryan",25, Gender.FEMALE));

        model.addAttribute("instructors",instructorList);

        return "instructor/instructor-list";


    }
}
