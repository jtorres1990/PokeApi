package com.pokemon.pokeapi.model.dto.pokeapiclient;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class PokemonTypeDto {

    private int slot;
    private TypeDto type;

}
