package com.service;/*
    @author ${user}
    @time 16:44
*/

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="hello-service",fallback = HelloServiceHystrix.class)
public interface HelloService {

    @RequestMapping("/hello")
    String hello();
}
