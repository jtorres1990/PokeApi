package com.pokemon.pokeapi.service.impl;

import com.pokemon.pokeapi.client.pokeapi.IPokeApiClient;
import com.pokemon.pokeapi.exception.GeneralException;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonAbilityDTO;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonDetailDto;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonResponseDto;
import com.pokemon.pokeapi.model.dto.soap.PokemonDto;
import com.pokemon.pokeapi.service.IPokemonSearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("apiSearch")
public class ApiSearchStrategy implements IPokemonSearchStrategy {

    @Autowired
    private IPokeApiClient pokeApiClient;

    @Override
    public PokemonDetailDto buscarPorNombreApi(PokemonDto nombre) {
        return pokeApiClient.getPokemonByName(nombre.getPokemonName());
    }

    @Override
    public List<PokemonDto> buscarPorNombre(PokemonDto nombre) throws GeneralException {
        return List.of();
    }

    @Override
    public PokemonResponseDto buscarTodos(int offset, int limit) {
        return pokeApiClient.getAllPokemon(offset, limit);
    }

    @Override
    public List<PokemonDto> buscarTodos() throws GeneralException {
        return List.of();
    }
}
