package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
}
