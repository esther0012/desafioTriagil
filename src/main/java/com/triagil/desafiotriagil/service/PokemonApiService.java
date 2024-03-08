package com.triagil.desafiotriagil.service;
import com.triagil.desafiotriagil.domains.PokemonDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonApiService {

    @Value("${pokeapi.baseurl}")
    private String pokeApiBaseUrl;

    private final RestTemplate restTemplate;

    public PokemonApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PokemonDTO getPokemonInfo(String pokemonName) {
        String url = pokeApiBaseUrl + "/pokemon/" + pokemonName.toLowerCase();
        return restTemplate.getForObject(url, PokemonDTO.class);
    }
}







