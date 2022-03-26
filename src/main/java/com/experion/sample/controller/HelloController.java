package com.experion.sample.controller;

import com.experion.sample.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    protected HelloService helloService;

    @GetMapping("/hello")
    protected String hello(@RequestParam(name = "name", required = false, defaultValue = "World") String name) {
        return helloService.greeting(name);
    }

}
