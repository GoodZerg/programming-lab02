package Pokemons;

import Moves.RockSlide;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Vibrava{
    public Flygon(String name, int level){
        super(name, level);
        this.setStats(80,100,80,80,80,100);
        this.setType(Type.GROUND, Type.DRAGON);
        this.addMove(new RockSlide());
    }
}
