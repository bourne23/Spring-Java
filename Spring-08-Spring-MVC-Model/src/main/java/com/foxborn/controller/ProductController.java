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

        model.addAttribute("name", "Fitness Program");  // create attribute in html, get value in UI
        model.addAttribute("class", "BodyPump"); // to use attr in html template

        //show location
        String location = "Miami, FL";
        model.addAttribute("location", location);

        //create some random Id(0-1000) and show it in your UI
        int memberId = new Random().nextInt();
        model.addAttribute("id", memberId);

        // show list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(25);
        numbers.add(75);
        numbers.add(250);
        numbers.add(999);                                   // <h2 th:text="${numbers}"></h2>
        model.addAttribute("numbers", numbers);  //<h2 th:text="${numbers.get(0)}"></h2>


        // Use model object
        Member member = new Member(101, "Bruce", "Willis");
        model.addAttribute("member", member);  //<h2 th:text="${member.getFirstName()}"></h2>


        return "/product/product";  //thymeleaf address of product.html
    }


}
