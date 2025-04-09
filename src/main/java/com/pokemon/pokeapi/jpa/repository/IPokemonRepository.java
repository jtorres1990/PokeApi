package com.pokemon.pokeapi.jpa.repository;

import com.pokemon.pokeapi.jpa.entity.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPokemonRepository extends JpaRepository<PokemonEntity, Long> {
    Object findByName(String name);
}
