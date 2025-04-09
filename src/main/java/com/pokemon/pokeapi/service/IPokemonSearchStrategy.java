package com.pokemon.pokeapi.service;

import com.pokemon.pokeapi.exception.GeneralException;

import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonDetailDto;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonResponseDto;
import com.pokemon.pokeapi.model.dto.soap.PokemonDto;


import java.util.List;

public interface IPokemonSearchStrategy {
    PokemonDetailDto buscarPorNombreApi(PokemonDto nombre);
    List<PokemonDto> buscarPorNombre(PokemonDto nombre) throws GeneralException;
    PokemonResponseDto buscarTodos(int offset, int limit) throws GeneralException;
    List<PokemonDto>  buscarTodos() throws GeneralException;
}
