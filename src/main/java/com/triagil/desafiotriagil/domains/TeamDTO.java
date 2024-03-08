package com.triagil.desafiotriagil.domains;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class TeamDTO {

    private Long id;
    private String owner;
    private List<PokemonDTO> pokemons;
}
