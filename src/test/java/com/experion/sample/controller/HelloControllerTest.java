package com.experion.sample.controller;

import com.experion.sample.service.HelloService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    private HelloController helloController;

    @Mock
    private HelloService helloServiceMocked;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        helloController = new HelloController();
        helloController.helloService = helloServiceMocked;
    }

    @Test
    public void helloTest() {
        Mockito.when(helloServiceMocked.greeting("")).thenReturn("Hello");
        assertEquals("Hello", helloController.hello(""));
        Mockito.verify(helloServiceMocked, Mockito.times(1)).greeting("");
    }

}
