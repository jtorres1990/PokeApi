package com.pokemon.pokeapi.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "pokemonresume")
@Data
public class PokemonResumeEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "pokemonname")
    private String pokemonName;

    @Column(name = "abilityname")
    private String abilityName;

    @Column(name = "typename")
    private String typeName;
}
