package com.pokemon.pokeapi.client.pokeapi;

import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonAbilityDTO;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonDetailDto;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "pokeApiClient", url = "https://pokeapi.co/api/v2")
public interface IPokeApiClient {
    @GetMapping("/pokemon/{name}")
    PokemonDetailDto getPokemonByName(@PathVariable("name") String name);

    @GetMapping("/pokemon")
    PokemonResponseDto getAllPokemon(@RequestParam int offset, @RequestParam int limit);
}