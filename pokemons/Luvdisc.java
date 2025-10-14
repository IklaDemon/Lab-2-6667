package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.DrainingKiss;
import attacks.Scald;
import attacks.Swagger;
import attacks.AquaJet;

/*
 * Create one of the Pokemon classes for your variant.
 * The class must inherit from the base class Pokemon.
 * In the constructor, you'll need to specify the Pokemon's types and
 * basic stats. After that, try adding the Pokemon to battle.
 */

public final class Luvdisc extends ru.ifmo.se.pokemon.Pokemon
{
    public Luvdisc(String name, int level)
    {
        super(name, level);
        // hp, attack, defence, special attack, special defence, speed
        this.setStats(43, 30, 55, 40, 65, 97);
        this.addType(Type.WATER);
        this.addMove(new DrainingKiss());
        this.addMove(new Scald());
        this.addMove(new Swagger());
        this.addMove(new AquaJet());
    }
}
