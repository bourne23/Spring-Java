package com.foxborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //Annotate the class with the @Controller stereotype annotation
public class HomeController {

    @RequestMapping("/home")   //Use @RequestMapping annotation to associate the action with an HTTP request path
    public String home(){
        return "home.html";      //Return the HTML document name that contains the details we want the browser to display
    }

    @RequestMapping("/welcome")
    public String home2(){
        return "welcome.html";
    }


    @RequestMapping   // this is default, with no end point
    public String home3(){
        return "welcome.html";
    }


}
