package com.aprendizesDoJava.StarWarsApi.controller;

import com.aprendizesDoJava.StarWarsApi.controller.response.HelloWorldApiResponse;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldControllerFabianoTest {
    private final HelloWorldControllerFabiano helloWorldControllerFabiano = new HelloWorldControllerFabiano();

    @Test
    void deveRetornarStatus200eMensagemHelloWorld() {
        ResponseEntity<HelloWorldApiResponse> result = helloWorldControllerFabiano.getHelloWorldAsJson();
        assertNotNull(result);
        assertEquals(200, result.getStatusCodeValue());
        assertEquals("Hello World!", result.getBody().getMessage());
    }
}
