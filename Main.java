import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main
{
    public static void main(String[] args)
    {
        Battle battle = new Battle();

        Pokemon luvdisc = new Luvdisc("Luvdisc", 35);
        Pokemon amaura = new Amaura("Amaura", 49);
        Pokemon aurorus = new Aurorus("Aurorus", 50);
        Pokemon deino = new Deino("Deino", 45);
        Pokemon zweilous = new Zweilous("Zweilous", 45);
        Pokemon hydreigon = new Hydreigon("Hydreigon", 50);

        battle.addAlly(amaura);
        battle.addAlly(zweilous);
        battle.addAlly(luvdisc);

        battle.addFoe(deino);
        battle.addFoe(aurorus);
        battle.addFoe(hydreigon);

        battle.go();
    }
}