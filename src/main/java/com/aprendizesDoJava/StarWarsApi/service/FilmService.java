package com.aprendizesDoJava.StarWarsApi.service;

import com.aprendizesDoJava.StarWarsApi.client.StarWarsApiClient;
import com.aprendizesDoJava.StarWarsApi.controller.response.FilmApiResponse;
import com.aprendizesDoJava.StarWarsApi.mapper.FilmApiResponseMapper;
import com.aprendizesDoJava.StarWarsApi.mapper.FilmDtoMapper;
import org.springframework.stereotype.Service;

@Service
public class FilmService {

    public final StarWarsApiClient client;

    public FilmService(StarWarsApiClient client) {
        this.client = client;
    }

    public FilmApiResponse getFilmById(int id) {
        return FilmApiResponseMapper.toFilmApiResponse(FilmDtoMapper.toDto(client.getFilmById(id)));
    }

}
