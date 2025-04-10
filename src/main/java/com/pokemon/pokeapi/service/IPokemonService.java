package com.pokemon.pokeapi.service;

import com.pokemon.pokeapi.jaxb.BuscarPokemonResponse;
import com.pokemon.pokeapi.jaxb.BuscarTodosResponse;

public interface IPokemonService {
    BuscarPokemonResponse getPokemonByName(String name);

    BuscarTodosResponse getAllPokemon(int offset, int limit);
}
