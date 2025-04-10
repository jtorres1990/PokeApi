package com.pokemon.pokeapi.endpoint;

import com.pokemon.pokeapi.jaxb.BuscarPokemonRequest;
import com.pokemon.pokeapi.jaxb.BuscarPokemonResponse;
import com.pokemon.pokeapi.jaxb.BuscarTodosRequest;
import com.pokemon.pokeapi.jaxb.BuscarTodosResponse;
import com.pokemon.pokeapi.model.dto.PokemonDTO;

import com.pokemon.pokeapi.service.IPokemonService;
import com.pokemon.pokeapi.service.impl.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PokemonEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/pokemonservice";

    @Autowired
    private IPokemonService service;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BuscarPokemonRequest")
    @ResponsePayload
    public BuscarPokemonResponse buscarPokemon(@RequestPayload BuscarPokemonRequest request) {
        return service.getPokemonByName(request.getNombre());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BuscarTodosRequest")
    @ResponsePayload
    public BuscarTodosResponse buscarTodos(@RequestPayload BuscarTodosRequest request) {
        return service.getAllPokemon(request.getOffset(), request.getLimit());
    }
}
