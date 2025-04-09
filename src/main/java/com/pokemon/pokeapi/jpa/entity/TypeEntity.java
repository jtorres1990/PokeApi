package com.pokemon.pokeapi.jpa.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "type")
@Data
public class TypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;



}
