package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class PowerGem extends SpecialMove {
    public PowerGem(){
        super(Type.ROCK, 80, 100);
    }
    protected java.lang.String describe(){
        return "применяет PowerGem";
    }
}
