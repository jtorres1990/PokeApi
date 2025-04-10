package com.pokemon.pokeapi.jaxb;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "BuscarPokemonResponse", namespace = "http://example.com/pokemonservice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class BuscarPokemonResponse {

    private int id;
    private String name;

    @XmlElement(name = "baseExperience")
    private int baseExperience;

    private int height;

    @XmlElementWrapper(name = "abilities")
    @XmlElement(name = "ability")
    private List<String> abilities;

    private String soundUrl;

}