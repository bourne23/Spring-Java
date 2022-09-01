package com.foxborn.controller;

import com.foxborn.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class ProductController {

    @RequestMapping("/product")
    public String productPage(Model model) {  // get instance of Model interface to use data - paste a parameter

        model.addAttribute("name", "value");  // create attribute in html, get value in UI
        model.addAttribute("class", "BodyPump"); // to use in html template

        String location = "Miami, FL";
        model.addAttribute("location", location);


        //create some random studentId(0-1000) and show it in your UI
        int memberId = new Random().nextInt();
        model.addAttribute("id", memberId);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        model.addAttribute("numbers", numbers);

        Member member = new Member(1, "Bruce", "Willis");
        model.addAttribute("member", member);


        return "product/product";
    }


}
