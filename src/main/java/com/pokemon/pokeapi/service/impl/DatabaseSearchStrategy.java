package com.pokemon.pokeapi.service.impl;

import com.pokemon.pokeapi.exception.GeneralException;
import com.pokemon.pokeapi.jpa.entity.PokemonResumeEntity;
import com.pokemon.pokeapi.jpa.repository.IPokemonRepository;
import com.pokemon.pokeapi.jpa.repository.IPokemonResumenRepository;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonAbilityDTO;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonDetailDto;
import com.pokemon.pokeapi.model.dto.pokeapiclient.PokemonResponseDto;
import com.pokemon.pokeapi.model.dto.soap.PokemonDto;
import com.pokemon.pokeapi.model.mapper.IPokemonMapper;
import com.pokemon.pokeapi.service.IPokemonSearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("dbSearch")
public class DatabaseSearchStrategy implements IPokemonSearchStrategy {
    @Autowired
    private IPokemonResumenRepository repo;
    @Autowired
    private IPokemonMapper mapper;

    @Override
    public PokemonDetailDto buscarPorNombreApi(PokemonDto nombre) {
        return null;
    }

    @Override
    public List<PokemonDto> buscarPorNombre(PokemonDto nombre) throws GeneralException {
        Example<PokemonResumeEntity> example = Example.of(mapper.toEntity(nombre));
        return Optional.of(repo.findAll(example).stream().map(mapper::toDto).toList()).orElseThrow(GeneralException::new);

    }

    @Override
    public PokemonResponseDto buscarTodos(int offset, int limit) throws GeneralException {
        return null;
    }

    @Override
    public List<PokemonDto> buscarTodos() throws GeneralException {
        return Optional.of(repo.findAll().stream()
                .map(mapper::toDto).toList()).orElseThrow(GeneralException::new);

    }


}