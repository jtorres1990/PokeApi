package com.pokemon.pokeapi.model.dto.pokeapiclient;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class PokemonAbilityDTO {

    private AbilityDTO ability;
    private boolean isHidden;
    private int slot;
}
