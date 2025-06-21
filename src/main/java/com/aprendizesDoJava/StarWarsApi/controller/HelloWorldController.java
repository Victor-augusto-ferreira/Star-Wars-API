package com.aprendizesDoJava.StarWarsApi.controller;

import com.aprendizesDoJava.StarWarsApi.controller.response.HelloWorldApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello-world")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<HelloWorldApiResponse> getHelloWorld() {
        HelloWorldApiResponse response = new HelloWorldApiResponse();
        response.setMessage("Hello World!");
        return ResponseEntity.ok(response);
    }
}
