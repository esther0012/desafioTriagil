package com.triagil.desafiotriagil.domains;

import lombok.Data;

import java.util.List;

@Data
public class TeamDTO {

    private Long id;
    private String owner;
    private List<PokemonDTO> pokemons;
}
