package com.service;/*
    @author ${user}
    @time 16:44
*/

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("hello-service")
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
