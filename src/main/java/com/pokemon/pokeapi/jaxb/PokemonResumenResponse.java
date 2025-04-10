package com.pokemon.pokeapi.jaxb;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "PokemonResumenResponse", namespace = "http://example.com/pokemonservice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class PokemonResumenResponse {

    @XmlElementWrapper(name = "resultados")
    @XmlElement(name = "pokemon")
    private List<PokemonResumenResponseReq> resultados;


}