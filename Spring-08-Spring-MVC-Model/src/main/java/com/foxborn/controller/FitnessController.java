package com.foxborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/fitness")
public class FitnessController {

    /*  GET DATA ON HTTP REQUEST
    1 - WITH HTTP REQUEST QUERY PARAMETER  /fitness/info?className=bodypump
    2 - WITH PATH VARIABLE              /fitness/info/className
     */


    //=======================QUERY PARAMETER=======================
    // 1.1. Just print to this query param:
    @RequestMapping("/go")             // http://localhost:8080/fitness/go?className=bodypump
    public String fitnessInfo(@RequestParam String className){
        System.out.println(className);
        return "fitness/fitness-info";
    }

    // 1.2. Use model to pass data via query param. Will not work without parameters. Params are REQUIRED
    @RequestMapping("/info")       //http://localhost:8080/fitness/info?className=bodypump&day=monday
    public String fitnessInfo(@RequestParam String className,@RequestParam String day, Model model){

        model.addAttribute("className",className);
        model.addAttribute("day",day);

        return "fitness/fitness-info";
    }

    // 1.3. Make params optional, so we can navigate to '/info2' , or http://localhost:8080/fitness/info2?className=bodypump
    @RequestMapping("/info2")      //http://localhost:8080/fitness/info2    >> make that param optional, value, required, default
    public String carInfo2(@RequestParam(value = "className",required = false,defaultValue = "BeachBody") String className, Model model){

        model.addAttribute("className",className);

        return "fitness/fitness-info";
    }

    //2.1. =======================PATH VARIABLE=======================
    @RequestMapping("/info/{className}/{day}")      //http://localhost:8080/fitness/info/bodypump/saturday
    public String getCarInfo(@PathVariable String className, @PathVariable String day, Model model){
        model.addAttribute("className",className);
        model.addAttribute("day",day);

        return "fitness/fitness-info";
    }




}
