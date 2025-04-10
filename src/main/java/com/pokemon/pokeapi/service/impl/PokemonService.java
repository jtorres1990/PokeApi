package com.pokemon.pokeapi.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.pokemon.pokeapi.client.pokeapi.IPokeApiClient;
import com.pokemon.pokeapi.jaxb.BuscarPokemonResponse;
import com.pokemon.pokeapi.jaxb.BuscarTodosResponse;
import com.pokemon.pokeapi.model.dto.PokemonBasicDTO;
import com.pokemon.pokeapi.model.dto.PokemonDTO;
import com.pokemon.pokeapi.model.mapper.IPokemonMapper;
import com.pokemon.pokeapi.service.IPokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonService implements IPokemonService {
    @Autowired
    private  IPokeApiClient client;

    @Autowired
    private  IPokemonMapper mapper;




    @Override
    public BuscarPokemonResponse getPokemonByName(String name) {

        JsonNode dto= client.getPokemonByName(name);
        BuscarPokemonResponse r=  jsonMaper(dto);
        return r;
    }

    private BuscarPokemonResponse jsonMaper(JsonNode json){

        PokemonDTO dto = new PokemonDTO();
        dto.setId(json.get("id").asInt());
        dto.setName(json.get("name").asText());
        dto.setBaseExperience(json.get("base_experience").asInt());
        dto.setHeight(json.get("height").asInt());

        // Extraer habilidades
        List<String> habilidades = new ArrayList<>();
        for (JsonNode nodo : json.get("abilities")) {
            habilidades.add(nodo.get("ability").get("name").asText());
        }
        dto.setAbilities(habilidades);

        // Extraer URL de sonido
        dto.setSoundUrl(json.path("cries").path("latest").asText());
        return toBuscarPokemonResponse(dto);
    }

    private BuscarPokemonResponse toBuscarPokemonResponse(PokemonDTO dto) {
        BuscarPokemonResponse resp = new BuscarPokemonResponse();
        resp.setId(dto.getId());
        resp.setName(dto.getName());
        resp.setBaseExperience(dto.getBaseExperience());
        resp.setHeight(dto.getHeight());
        resp.setAbilities(dto.getAbilities());
        resp.setSoundUrl(dto.getSoundUrl());
        return resp;
    }

    @Override
    public BuscarTodosResponse getAllPokemon(int offset, int limit) {
        return mapper.toBuscarTodosResponse(client.getAllPokemon(offset, limit));

    }
}