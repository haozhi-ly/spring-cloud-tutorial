package com.service;/*
    @author ${user}
    @time 23:37
*/

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String hello() {
        String url = "http://hi-service/hello2";
        HashMap<String,Object> result = restTemplate.getForEntity(url,HashMap.class).getBody();
        return result.toString();
    }

    public String fallback(){
        return "server is busying";
    }
}
