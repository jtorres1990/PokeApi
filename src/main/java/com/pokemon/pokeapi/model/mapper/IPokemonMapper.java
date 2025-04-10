package com.pokemon.pokeapi.model.mapper;

import com.pokemon.pokeapi.jaxb.BuscarPokemonResponse;
import com.pokemon.pokeapi.jaxb.BuscarTodosResponse;
import com.pokemon.pokeapi.jaxb.PokemonResumenResponseReq;
import com.pokemon.pokeapi.jpa.entity.PokemonEntity;
import com.pokemon.pokeapi.jpa.entity.PokemonResumeEntity;
import com.pokemon.pokeapi.model.dto.PokemonDTO;
import com.pokemon.pokeapi.model.dto.PokemonListResponseDTO;
import com.pokemon.pokeapi.model.dto.PokemonResumeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IPokemonMapper {
    IPokemonMapper INSTANCE = Mappers.getMapper(IPokemonMapper.class);
    BuscarTodosResponse toBuscarTodosResponse(PokemonListResponseDTO dto);
    BuscarPokemonResponse toBuscarPokemonResponse(PokemonDTO dto);

    PokemonResumeDTO toPokemonResumeDTO(PokemonResumeEntity pokemonEntity);
    PokemonResumeEntity toPokemonResumeEntity(PokemonResumeDTO pokemonDTO);
    PokemonResumenResponseReq toPokemonResumenResponseReq(PokemonResumeDTO dto);
}
