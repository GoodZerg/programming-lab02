package Pokemons;

import Moves.Bulldoze;
import Moves.DoubleTeam;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Trapinch extends Pokemon{
    public Trapinch(String name, int level){
        super(name, level);
        this.setStats(45,100,45,45,45,10);
        this.setType(Type.GROUND);
        this.addMove(new Bulldoze());
        this.addMove(new DoubleTeam());
    }
}
