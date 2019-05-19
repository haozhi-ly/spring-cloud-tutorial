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

@RestController
public class HelloController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String hello() {
        return "hello,from localhost:"+port;
    }

    @RequestMapping("/hello2")
    public Map<String,Object> helloConvertEntity() {
        String value = "hello,from localhost:"+port;
        Map<String,Object> result = new HashMap<>();
        result.put("key",value);
        return result;
    }
}
