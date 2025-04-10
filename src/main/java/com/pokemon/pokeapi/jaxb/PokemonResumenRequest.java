package com.pokemon.pokeapi.jaxb;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "PokemonResumenRequest", namespace = "http://example.com/pokemonservice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class PokemonResumenRequest {
    @XmlElement(namespace = "http://example.com/pokemonservice")
    private Long id;
    @XmlElement(namespace = "http://example.com/pokemonservice")
    private String pokemonName;
    @XmlElement(namespace = "http://example.com/pokemonservice")
    private String abilityName;
    @XmlElement(namespace = "http://example.com/pokemonservice")
    private String typeName;

}
