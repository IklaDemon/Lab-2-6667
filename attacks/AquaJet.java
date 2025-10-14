/*
 * Type: WATER
 * Category: Physical
 * Power: 40
 * Accuracy: 100
 * 
 * Effects:
 * Aqua Jet deals damage and has a priority of +1.
 * Moves with a higher priority always go first, regardless of a Pokémon's
 * speed. If two moves with the same priority are used, the faster Pokémon
 * goes first as usual.
 */

package attacks;

import ru.ifmo.se.pokemon.*;

public final class AquaJet extends ru.ifmo.se.pokemon.PhysicalMove
{
    public AquaJet()
    {
        // Type: WATER, Power: 40, Accuracy: 100, priority: 1, hits: 1
        super(Type.FAIRY, 50, 100, 1, 1);
    }

    @Override protected String describe()
    {
        return "Aqua-Jets";
    }
}
