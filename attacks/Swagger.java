/*
 * Type: NORMAL
 * Category: Status
 * Power: -
 * Accuracy: 85
 * 
 * Effects:
 * Swagger confuses the target and raises its Attack by two stages.
 * If one of the two effects cannot be invoked (for example the target
 * is already confused or its Attack is already raised to the maximum
 * of +6 stages), Swagger still works and will invoke the other effect.
 * Confused Pokémon have a 33% chance of hurting themselves each turn,
 * for 1-4 attacking turns (50% chance in Generations 1-6). The damage
 * received is as if the Pokémon attacks itself with a typeless 40 base
 * power Physical attack.
 */

package attacks;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends ru.ifmo.se.pokemon.StatusMove
{
    public Swagger()
    {
        // Type: NORMAL, Power: -, Accuracy: 85
        super(Type.NORMAL, 0, 85);
    }

    /*
     * Swagger confuses the target and raises its Attack by two stages.
     * 3 turns... idk how many it's supposed to last...
     */
    @Override protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.ATTACK, +1);
        p.setMod(Stat.ATTACK, +1);
        Effect.confuse(p); // confuses the defender
    }

    @Override protected String describe()
    {
        return "Swaggers";
    }
}
