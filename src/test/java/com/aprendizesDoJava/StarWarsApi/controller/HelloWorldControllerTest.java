package com.aprendizesDoJava.StarWarsApi.controller;

import com.aprendizesDoJava.StarWarsApi.controller.response.HelloWorldApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerTest {

    private final HelloWorldControllerVictor helloWorldControllerVictor = new HelloWorldControllerVictor();

    @Test
    void getHelloWorld() {
        ResponseEntity<HelloWorldApiResponse> result = helloWorldControllerVictor.getHelloWorld();

        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("Hello World!", result.getBody().getMessage());
    }
}