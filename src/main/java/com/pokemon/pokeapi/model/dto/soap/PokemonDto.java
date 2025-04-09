package com.pokemon.pokeapi.model.dto.soap;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class PokemonDto {

    private Long id;
    private String pokemonName;
    private String abilityName;
    private String typeName;


}
