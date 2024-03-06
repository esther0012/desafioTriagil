package com.triagil.desafiotriagil.service;

import com.triagil.desafiotriagil.model.Pokemon;
import com.triagil.desafiotriagil.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    @Autowired
    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public List<Pokemon> getAllPokemons() {
        return pokemonRepository.findAll();
    }

    public Pokemon getPokemonById(Long id) {
        return pokemonRepository.findById(id).orElse(null);
    }

}
