package com.pokemon.pokeapi.jpa.repository;

import com.pokemon.pokeapi.jpa.entity.AbilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAbilityRepository extends JpaRepository<AbilityEntity, Long> {

}
