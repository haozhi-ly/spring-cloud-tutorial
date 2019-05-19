package com.controller;/*
    @author ${user}
    @time 16:33
*/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    @Value("${from}")
    private String from;

    @resonseBoady
    @RequestMapping("/hello")
    public String hello() {
        return "hello,the profile is "+from;
    }


}
