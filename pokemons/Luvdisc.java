package pokemons;

import ru.ifmo.se.pokemon.*;

/*
 * Create one of the Pokemon classes for your variant.
 * The class must inherit from the base class Pokemon.
 * In the constructor, you'll need to specify the Pokemon's types and basic stats.
 * After that, try adding the Pokemon to battle.
 */

public class Luvdisc extends ru.ifmo.se.pokemon.Pokemon
{
    public Luvdisc(String name, int level)
    {
        super(name, level);
        this.setStats(43, 30, 55, 40, 65, 97);
        this.addType(Type.WATER);
    }
}
