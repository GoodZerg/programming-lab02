package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL, 0, 85);
    }
    protected void applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }
    protected java.lang.String describe(){
        return "применяет Swagger";
    }
}
