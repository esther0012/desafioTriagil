package com.triagil.desafiotriagil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TEAM")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "OWNER")
    private String owner;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "TEAM_ID")
    private List<Pokemon> pokemons;

}
