package com.pokemon.pokeapi.jaxb;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement(name = "BuscarTodosRequest", namespace = "http://example.com/pokemonservice")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class BuscarTodosRequest {

    @XmlElement(namespace = "http://example.com/pokemonservice")
    private int offset;
    @XmlElement(namespace = "http://example.com/pokemonservice")
    private int limit;

}