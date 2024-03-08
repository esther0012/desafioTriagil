package com.triagil.desafiotriagil.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "POKEMON")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String name;

    @Column(name = "WEIGHT")
    private String weight;

    @Column(name = "HEIGHT")
    private String height;

    // Getters e setters
}
