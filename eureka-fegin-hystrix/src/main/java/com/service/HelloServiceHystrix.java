package com.service;/*
    @author ${user}
    @time 17:31
*/

import org.springframework.stereotype.Component;

@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String hello() {
        return "server is busying";
    }
}
