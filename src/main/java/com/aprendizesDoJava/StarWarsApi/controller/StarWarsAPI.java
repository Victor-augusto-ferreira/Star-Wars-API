package com.aprendizesDoJava.StarWarsApi.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StarWarsAPI {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }
}