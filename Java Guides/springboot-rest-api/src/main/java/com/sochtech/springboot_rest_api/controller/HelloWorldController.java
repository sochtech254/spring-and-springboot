package com.sochtech.springboot_rest_api.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController
{
    // HTTP GET Request
    // http://loclhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld()
    {
        return "Hello World!";
    }
}
