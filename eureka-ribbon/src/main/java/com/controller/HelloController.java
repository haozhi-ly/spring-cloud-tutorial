package com.controller;/*
    @author ${user}
    @time 16:33
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
public class HelloController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String hello() {
        String url = "http://hi-service/hello2";
        HashMap<String,Object> result = restTemplate.getForEntity(url,HashMap.class).getBody();
        return result.toString();
    }
}
