package com.triagil.desafiotriagil.controller;

import com.triagil.desafiotriagil.model.Pokemon;
import com.triagil.desafiotriagil.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pokemons")
public class PokemonController {

    private final PokemonService pokemonService;

    @Autowired
    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> getAllPokemons() {
        List<Pokemon> pokemons = pokemonService.getAllPokemons();
        return new ResponseEntity<>(pokemons, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> getPokemonById(@PathVariable Long id) {
        Pokemon pokemon = pokemonService.getPokemonById(id);
        if (pokemon != null) {
            return new ResponseEntity<>(pokemon, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
