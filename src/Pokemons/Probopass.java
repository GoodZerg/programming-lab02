package Pokemons;

import Moves.BodyPress;
import Moves.ShadowBall;
import Moves.Swagger;
import Moves.ThunderWave;
import ru.ifmo.se.pokemon.Type;

public class Probopass extends Nosepass{
    public Probopass(String name, int level){
        super(name, level);
        this.setStats(60,55,145,75,150,40);
        this.setType(Type.ROCK, Type.STEEL);
        this.addMove(new BodyPress());
    }
}
