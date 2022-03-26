package com.experion.sample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void helloEndPointTest() {
        ResponseEntity<String> result = template.withBasicAuth("admin", "password").getForEntity("/hello", String.class);
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals("Hello World", result.getBody());

        result = template.withBasicAuth("admin", "password").getForEntity("/hello?name=Nanda", String.class);
        assertEquals(HttpStatus.OK, result.getStatusCode());
        assertEquals("Hello Nanda", result.getBody());
    }

}
