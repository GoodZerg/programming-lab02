package Moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }
    protected void applySelfEffects(Pokemon p){
        p.setCondition(new Effect().chance(0.75).turns(3).stat(Stat.EVASION, 1));
    }
}
