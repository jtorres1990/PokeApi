package com.pokemon.pokeapi.model.dto.pokeapiclient;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
@Builder
public class PokemonDetailDto {

    private String name;
    private List<PokemonAbilityDTO> abilities;
    private List<PokemonTypeDto> types;
}
