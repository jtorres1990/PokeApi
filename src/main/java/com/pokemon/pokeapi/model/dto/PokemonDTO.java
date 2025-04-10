package com.pokemon.pokeapi.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class PokemonDTO {

    private int id;
    private String name;
    private int baseExperience;
    private int height;
    private List<String> abilities;
    private String soundUrl;

}