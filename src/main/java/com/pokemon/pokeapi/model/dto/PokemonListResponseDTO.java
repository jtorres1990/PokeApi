package com.pokemon.pokeapi.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@Builder
@ToString
public class PokemonListResponseDTO {
    private int count;
    private String next;
    private String previous;
    private List<PokemonBasicDTO> results;

}
