package com.pokemon.pokeapi.model.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class PokemonResumeDTO {


    private Long id;


    private String pokemonName;


    private String abilityName;


    private String typeName;
}
