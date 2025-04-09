package com.pokemon.pokeapi.component;

import com.pokemon.pokeapi.service.IPokemonSearchStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SearchStrategyFactory {
    private final IPokemonSearchStrategy apiSearch;
    private final IPokemonSearchStrategy dbSearch;

    public SearchStrategyFactory(@Qualifier("apiSearch") IPokemonSearchStrategy apiSearch,
                                 @Qualifier("dbSearch") IPokemonSearchStrategy dbSearch) {
        this.apiSearch = apiSearch;
        this.dbSearch = dbSearch;
    }

    public IPokemonSearchStrategy getStrategy(String origen) {
        return "API".equalsIgnoreCase(origen) ? apiSearch : dbSearch;
    }
}