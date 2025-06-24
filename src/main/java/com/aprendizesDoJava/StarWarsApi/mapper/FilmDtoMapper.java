package com.aprendizesDoJava.StarWarsApi.mapper;

import com.aprendizesDoJava.StarWarsApi.client.response.FilmClientResponse;
import com.aprendizesDoJava.StarWarsApi.model.dto.FilmDto;

public class FilmDtoMapper {
    public static FilmDto toDto (FilmClientResponse response) {
        return FilmDto.builder()
                .title(response.getTitle())
                .episode_id(response.getEpisode_id())
                .director(response.getDirector())
                .producer(response.getProducer())
                .release_date(response.getRelease_date())
                .characters(response.getCharacters())
                .planets(response.getPlanets())
                .starships(response.getStarships())
                .vehicles(response.getVehicles())
                .species(response.getSpecies())
                .url(response.getUrl())
                .build();
    }
}
