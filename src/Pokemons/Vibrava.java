package Pokemons;

import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Trapinch{
    public Vibrava(String name, int level){
        super(name, level);
        this.setStats(50,70,50,50,50,70);
        this.setType(Type.GROUND, Type.DRAGON);
    }
}
