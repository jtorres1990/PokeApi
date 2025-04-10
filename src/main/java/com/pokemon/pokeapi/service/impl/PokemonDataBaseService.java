package com.pokemon.pokeapi.service.impl;

import com.pokemon.pokeapi.exception.GeneralException;
import com.pokemon.pokeapi.jaxb.PokemonResumenResponse;
import com.pokemon.pokeapi.jaxb.PokemonResumenResponseReq;
import com.pokemon.pokeapi.jpa.entity.PokemonEntity;
import com.pokemon.pokeapi.jpa.entity.PokemonResumeEntity;
import com.pokemon.pokeapi.jpa.repository.IPokemonRepository;
import com.pokemon.pokeapi.jpa.repository.IPokemonResumenRepository;
import com.pokemon.pokeapi.model.dto.PokemonDTO;
import com.pokemon.pokeapi.model.dto.PokemonResumeDTO;
import com.pokemon.pokeapi.model.mapper.IPokemonMapper;
import com.pokemon.pokeapi.service.IPokemonDataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonDataBaseService implements IPokemonDataBaseService {

    @Autowired
    IPokemonRepository pokemonRepository;

    @Autowired
    IPokemonResumenRepository pokemonResumenRepository;

    @Autowired
    IPokemonMapper pokemonMapper;





    @Override
    public PokemonResumenResponse getPokemonDataBase(PokemonResumeDTO pokemonDTO) {
        Example<PokemonResumeEntity> example = Example.of(pokemonMapper.toPokemonResumeEntity(pokemonDTO));


       List<PokemonResumeDTO> dto= Optional.of(pokemonResumenRepository.findAll(example).stream()
                .map(pokemonMapper::toPokemonResumeDTO).toList()).orElseThrow(GeneralException::new);

        List<PokemonResumenResponseReq> resultados = dto.stream()
                .map(pokemonMapper::toPokemonResumenResponseReq)
                .toList();

        if (resultados.isEmpty()) {
            throw new GeneralException("No se encontraron resultados para los filtros ingresados");
        }

        PokemonResumenResponse response = new PokemonResumenResponse();
        response.setResultados(resultados);
        return response;
    }
}
