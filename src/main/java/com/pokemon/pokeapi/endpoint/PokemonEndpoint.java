package com.pokemon.pokeapi.endpoint;

import com.pokemon.pokeapi.jaxb.*;
import com.pokemon.pokeapi.model.dto.PokemonResumeDTO;
import com.pokemon.pokeapi.service.IPokemonDataBaseService;
import com.pokemon.pokeapi.service.IPokemonService;
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

    @Autowired
    private IPokemonDataBaseService pokemonDataBaseService;

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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PokemonResumenRequest")
    @ResponsePayload
    public PokemonResumenResponse busquedaFiltrada(@RequestPayload PokemonResumenRequest request) {
        PokemonResumeDTO filtro = new PokemonResumeDTO();
        filtro.setId(request.getId());
        filtro.setPokemonName(request.getPokemonName());
        filtro.setAbilityName(request.getAbilityName());
        filtro.setTypeName(request.getTypeName());

        return pokemonDataBaseService.getPokemonDataBase(filtro);
    }
}
