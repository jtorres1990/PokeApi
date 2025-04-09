package com.pokemon.pokeapi.jpa.repository;

import com.pokemon.pokeapi.jpa.entity.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITypeRepository extends JpaRepository<TypeEntity, Long> {
}
