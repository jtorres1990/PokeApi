package com.pokemon.pokeapi.model.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PokemonBasic")
public class PokemonBasicDTO {
    private String name;
    private String url;

}
