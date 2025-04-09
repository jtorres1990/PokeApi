package com.pokemon.pokeapi.controller;

import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonDetailDto;
import com.pokemon.pokeapi.model.dto.soap.PokemonDto;
import com.pokemon.pokeapi.service.IPokemonSearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PokemonController {

    private static final String NAMESPACE_URI = "http://example.com/pokemonservice";
    @Qualifier("apiSearch")
    @Autowired
    private IPokemonSearchStrategy pokemonSearchStrategy;


    @Qualifier("dbSearch")
    @Autowired
    private IPokemonSearchStrategy pokemonSearchStrategyDB;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BuscarPokemonRequest")
    @ResponsePayload
    public PokemonDetailDto buscarPokemon(@RequestPayload PokemonDto request) {
        return  pokemonSearchStrategy.buscarPorNombreApi(request);
    }
}
