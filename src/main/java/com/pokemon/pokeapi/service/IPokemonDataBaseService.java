package com.pokemon.pokeapi.service;

import com.pokemon.pokeapi.jaxb.PokemonResumenResponse;

import com.pokemon.pokeapi.model.dto.PokemonResumeDTO;



public interface IPokemonDataBaseService {




    PokemonResumenResponse getPokemonDataBase(PokemonResumeDTO pokemonDTO);
}
