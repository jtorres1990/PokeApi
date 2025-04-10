package com.pokemon.pokeapi.jaxb;


import com.pokemon.pokeapi.model.dto.PokemonBasicDTO;
import jakarta.xml.bind.annotation.*;
import lombok.Data;

import java.util.List;

@XmlRootElement(name = "BuscarTodosResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class BuscarTodosResponse {

    private int count;
    private String next;
    private String previous;

    @XmlElementWrapper(name = "results")
    @XmlElement(name = "pokemon")
    private List<PokemonBasicDTO> results;


}
