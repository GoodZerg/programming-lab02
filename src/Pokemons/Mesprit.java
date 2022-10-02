package Pokemons;

import Moves.DoubleTeam;
import Moves.ShadowBall;
import Moves.Swagger;
import Moves.ThunderWave;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

public class Mesprit extends Pokemon {
    public Mesprit(String name, int level){
        super(name,level);
        this.setStats(80,105,105,105,105,80);
        this.setType(Type.PSYCHIC);
        this.addMove(new ThunderWave());
        this.addMove(new ShadowBall());
        this.addMove(new Swagger());
        this.addMove(new DoubleTeam());
    }
}
