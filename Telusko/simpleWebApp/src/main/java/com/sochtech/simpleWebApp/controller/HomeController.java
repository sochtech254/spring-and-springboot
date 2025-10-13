package com.sochtech.simpleWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
    @RequestMapping("/")
    @ResponseBody
    public String greet()
    {
        System.out.println("I'm here...");
        return "Welcome to SochTech Software Solutions";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "I don't teach, I educate!!";
    }
}
