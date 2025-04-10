package com.pokemon.pokeapi.client.pokeapi;


import com.fasterxml.jackson.databind.JsonNode;

import com.pokemon.pokeapi.model.dto.PokemonListResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokeApiClient", url = "https://pokeapi.co/api/v2")
public interface IPokeApiClient {
    @GetMapping("/pokemon/{name}")
    JsonNode getPokemonByName(@PathVariable("name") String name);

    @GetMapping("/pokemon")
    PokemonListResponseDTO getAllPokemon(@RequestParam int offset, @RequestParam int limit);
}