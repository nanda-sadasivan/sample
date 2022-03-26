package com.experion.sample.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greeting(String name) {
        return "Hello " + name;
    }
}
