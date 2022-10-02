package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST, 80, 100);
    }
    protected java.lang.String describe(){
        return "применяет ShadowBall";
    }
}
