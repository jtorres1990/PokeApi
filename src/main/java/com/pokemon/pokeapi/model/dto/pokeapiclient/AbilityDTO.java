package com.pokemon.pokeapi.model.dto.pokeapiclient;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class AbilityDTO {

    private String name;
    private String url;
}
