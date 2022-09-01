package com.foxborn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // spring looks for all classes with @Controller and for methods with @RequestMapping
public class UserController {

    @RequestMapping("/user")
    public String user(){

        return "/user/userinfo.html";  // go to folder 'static' Get html file
    }

}
