package com.aprendizesDoJava.StarWarsApi.controller;

import com.aprendizesDoJava.StarWarsApi.client.StarWarsApiClient;
import com.aprendizesDoJava.StarWarsApi.client.response.FilmClientResponse;
import com.aprendizesDoJava.StarWarsApi.controller.response.FilmApiResponse;
import com.aprendizesDoJava.StarWarsApi.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/films")
public class FilmController {

    @Autowired
    private FilmService service;

    @GetMapping("/{id}")
    public ResponseEntity<FilmApiResponse> getFilm(@PathVariable int id){
        return ResponseEntity.ok(service.getFilmById(id));
    }
}
