package com.pokemon.pokeapi.model.dto.pokeapiclient;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
@Builder
public class PokemonResponseDto {

    private int count;
    private String next;
    private String previous;
    private List<PokemonBasicDTO> results;
}
