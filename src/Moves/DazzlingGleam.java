package Moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(){
        super(Type.FAIRY, 80, 100);
    }
    protected java.lang.String describe(){
        return "применяет DazzlingGleam";
    }
}
