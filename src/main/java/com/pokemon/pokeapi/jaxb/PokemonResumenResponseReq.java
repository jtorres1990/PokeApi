package com.pokemon.pokeapi.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "PokemonResumenResponseReq", namespace = "http://example.com/pokemonservice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class PokemonResumenResponseReq {

    private Long id;
    private String pokemonName;
    private String abilityName;
    private String typeName;
}