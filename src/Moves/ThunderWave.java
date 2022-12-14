package Moves;

import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove {
    public ThunderWave(){
        super(Type.ELECTRIC, 0, 90);
    }
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.75).turns(3).stat(Stat.SPEED, -1));
    }
    protected java.lang.String describe(){
        return "применяет ThunderWave";
    }
}
