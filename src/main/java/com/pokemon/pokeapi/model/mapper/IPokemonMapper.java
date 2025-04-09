package com.pokemon.pokeapi.model.mapper;


import com.pokemon.pokeapi.jpa.entity.PokemonResumeEntity;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonDetailDto;
import com.pokemon.pokeapi.model.dto.soap.PokemonDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IPokemonMapper {

    PokemonResumeEntity toEntity(PokemonDto pokemonDto);

    PokemonDto toDto(PokemonResumeEntity pokemonEntity);

    @Mapping(target = "abilityName", source = "ability.name")
    PokemonDto toDtofromApi(PokemonDetailDto pokemonAbilityDTO);
}
