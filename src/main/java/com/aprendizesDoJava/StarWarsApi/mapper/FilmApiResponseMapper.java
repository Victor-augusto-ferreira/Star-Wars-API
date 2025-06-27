package com.aprendizesDoJava.StarWarsApi.mapper;

import com.aprendizesDoJava.StarWarsApi.controller.response.FilmApiResponse;
import com.aprendizesDoJava.StarWarsApi.model.dto.FilmDto;

public class FilmApiResponseMapper {
    public static FilmApiResponse toFilmApiResponse(FilmDto filmDto) {
        return FilmApiResponse.builder()
                .title(filmDto.getTitle())
                .episode_id(filmDto.getEpisode_id())
                .director(filmDto.getDirector())
                .producer(filmDto.getProducer())
                .release_date(filmDto.getRelease_date())
                .characters(filmDto.getCharacters())
                .planets(filmDto.getPlanets())
                .starships(filmDto.getStarships())
                .vehicles(filmDto.getVehicles())
                .species(filmDto.getSpecies())
                .url(filmDto.getUrl())
                .build();
    }
}
