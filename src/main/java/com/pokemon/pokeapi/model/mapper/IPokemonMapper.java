package com.pokemon.pokeapi.model.mapper;

import com.pokemon.pokeapi.jaxb.BuscarPokemonResponse;
import com.pokemon.pokeapi.jaxb.BuscarTodosResponse;
import com.pokemon.pokeapi.model.dto.PokemonDTO;
import com.pokemon.pokeapi.model.dto.PokemonListResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IPokemonMapper {
    IPokemonMapper INSTANCE = Mappers.getMapper(IPokemonMapper.class);
    BuscarTodosResponse toBuscarTodosResponse(PokemonListResponseDTO dto);
    BuscarPokemonResponse toBuscarPokemonResponse(PokemonDTO dto);
}
