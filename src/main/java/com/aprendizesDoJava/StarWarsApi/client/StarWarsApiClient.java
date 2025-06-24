package com.aprendizesDoJava.StarWarsApi.client;

import com.aprendizesDoJava.StarWarsApi.client.response.FilmClientResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class StarWarsApiClient {

    private final RestTemplate restTemplate;

    private String baseUrl = "https://swapi.info/api/films/";

    public StarWarsApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public FilmClientResponse getFilmById(int id) {
            String url = baseUrl + id;
            return restTemplate.getForObject(url, FilmClientResponse.class);
    }
}
