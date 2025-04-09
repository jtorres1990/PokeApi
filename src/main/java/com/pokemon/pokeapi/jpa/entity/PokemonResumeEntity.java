package com.pokemon.pokeapi.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pokemonResume")
@Data
public class PokemonResumeEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "pokemonName")
    private String pokemonName;

    @Column(name = "abilityName")
    private String abilityName;

    @Column(name = "typeName")
    private String typeName;
}
