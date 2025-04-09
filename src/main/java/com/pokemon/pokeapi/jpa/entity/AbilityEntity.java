package com.pokemon.pokeapi.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ability")
@Data
public class AbilityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

}