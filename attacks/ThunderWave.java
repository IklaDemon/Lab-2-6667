/*
 * Type: ELECTRIC
 * Category: Status
 * Power: -
 * Accuracy: 90
 * 
 * Effects:
 * Thunder Wave paralyzes the opponent. Paralyzed Pokémon have a 25% chance
 * of not being able to attack, and their Speed is decreased by 50% (75%
 * in Generations 1-6).
 * Electric type Pokémon, those with the ability Limber or those behind a
 * Substitute cannot be paralyzed.
 */

package attacks;

import ru.ifmo.se.pokemon.*;

public final class ThunderWave extends ru.ifmo.se.pokemon.StatusMove
{
    public ThunderWave()
    {
        // Type: ELECTRIC, Power: -, Accuracy: 90
        super(Type.ELECTRIC, 0, 90);
    }

    @Override protected void applyOppEffects(Pokemon p)
    {
        Effect.paralyze(p);
    }

    @Override protected String describe()
    {
        return "Thunder Waves";
    }
}
