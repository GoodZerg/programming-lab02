package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Nosepass extends Pokemon{
    public Nosepass(String name, int level){
        super(name, level);
        this.setStats(30,45,135,45,90,30);
        this.setType(Type.ROCK);
        this.addMove(new DazzlingGleam());
        this.addMove(new Bulldoze());
        this.addMove(new PowerGem());
    }
}
