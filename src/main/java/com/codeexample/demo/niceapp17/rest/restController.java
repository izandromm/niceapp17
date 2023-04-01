package com.codeexample.demo.niceapp17.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {

    // expose "/" that return "Hello world"

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }




}
