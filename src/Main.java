import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon mesprit =    new Pokemon("Mesprit",  1);
        Pokemon nosepass =   new Pokemon("Nosepass", 1);
        Pokemon probopass =  new Pokemon("Probopass",  1);
        Pokemon trapinch =   new Pokemon("Trapinch", 1);
        Pokemon vibrava =    new Pokemon("Vibrava", 1);
        Pokemon flygon =     new Pokemon("Flygon", 1);
        battle.addAlly(mesprit);
        battle.addAlly(nosepass);
        battle.addAlly(probopass);
        battle.addFoe(trapinch);
        battle.addFoe(vibrava);
        battle.addFoe(flygon);
        battle.go();
    }
}