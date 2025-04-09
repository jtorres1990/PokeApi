package com.pokemon.pokeapi.jpa.repository;

import com.pokemon.pokeapi.jpa.entity.PokemonResumeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPokemonResumenRepository extends JpaRepository<PokemonResumeEntity, Long> {
}
