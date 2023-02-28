package com.montaury.pokebagarre.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PokemonTest {

    @Test
    void AttaqueSuperieurPokemon1() {
        //GIVEN
        Stats stat1 =new Stats(10,55);
        Stats stat2 =new Stats(5,20);
        Pokemon pokemon1 = new Pokemon("Magicarpe","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/129.png",stat1);
        Pokemon pokemon2 = new Pokemon("Luxio","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/404.png",stat2);


        //WHEN
           Boolean fin = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true,fin);
    }
    @Test
    void AttaqueSuperieurPokemon2() {
        //GIVEN
        Stats stat1 =new Stats(10,55);
        Stats stat2 =new Stats(200,20);
        Pokemon pokemon2 = new Pokemon("Magicarpe","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/129.png",stat1);
        Pokemon pokemon1 = new Pokemon("Luxio","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/404.png",stat2);


        //WHEN
        Boolean fin = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true,fin);
    }

    @Test
    void Pokemon1DefenseSuperieurEtAttaqueEgal() {
        //GIVEN
        Stats stat1 =new Stats(10,55);
        Stats stat2 =new Stats(10,23);
        Pokemon pokemon1 = new Pokemon("Magicarpe","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/129.png",stat1);
        Pokemon pokemon2 = new Pokemon("Luxio","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/404.png",stat2);


        //WHEN
        Boolean fin = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true,fin);

    }
    @Test
    void Pokemon2DefenseSuperieurEtAttaqueEgal() {
        //GIVEN
        Stats stat1 =new Stats(10,55);
        Stats stat2 =new Stats(10,60);
        Pokemon pokemon2 = new Pokemon("Magicarpe","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/129.png",stat1);
        Pokemon pokemon1 = new Pokemon("Luxio","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/404.png",stat2);


        //WHEN
        Boolean fin = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true,fin);

    }
    @Test
    void DefenseEtAttaqueEgal() {
        //GIVEN
        Stats stat1 =new Stats(55,55);
        Stats stat2 =new Stats(55,55);
        Pokemon pokemon1 = new Pokemon("Magicarpe","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/129.png",stat1);
        Pokemon pokemon2 = new Pokemon("Luxio","https:\\/\\/raw.githubusercontent.com\\/PokeAPI\\/sprites\\/master\\/sprites\\/pokemon\\/other\\/official-artwork\\/404.png",stat2);


        //WHEN
        Boolean fin = pokemon1.estVainqueurContre(pokemon2);
        //THEN
        assertEquals(true,fin);

    }
}