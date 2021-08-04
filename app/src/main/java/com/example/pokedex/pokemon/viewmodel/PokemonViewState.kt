package com.example.pokedex.pokemon.viewmodel

import com.example.pokedex.network.PokemonStats
import com.example.pokedex.network.PokemonType

data class PokemonViewState(
    val pokemonName: String = "",
    val pokemonOrderNumber: Int = -1,
    val pokemonStats: Array<PokemonStats> = emptyArray(),
    val pokemonType: Array<PokemonType> = emptyArray()
)