import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Mesprit mesprit =      new Mesprit("aRolf",        1);
        Nosepass nosepass =    new Nosepass("Starege",     1);
        Probopass probopass =  new Probopass("Basedge",    1);
        Trapinch trapinch =    new Trapinch("Deadge",      1);
        Vibrava vibrava =      new Vibrava("Joker",        1);
        Flygon flygon =        new Flygon("Optimus Prime", 1);
        battle.addAlly(mesprit);
        battle.addAlly(nosepass);
        battle.addAlly(probopass);
        battle.addFoe(trapinch);
        battle.addFoe(vibrava);
        battle.addFoe(flygon);
        battle.go();
    }
}