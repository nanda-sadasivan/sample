package com.experion.sample.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {

    private final HelloService helloService = new HelloService();

    @Test
    public void greetingTest() {
        assertEquals("Hello World", helloService.greeting("World"));
    }

}
