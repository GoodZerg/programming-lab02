package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class BodyPress extends PhysicalMove {
    public BodyPress(){
        super(Type.FIGHTING, 80, 100);
    }
    protected java.lang.String describe(){
        return "применяет BodyPress";
    }
}
