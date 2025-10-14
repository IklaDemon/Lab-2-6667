/*
 * Type: DARK
 * Category: Special
 * Power: 80
 * Accuracy: 100
 * 
 * Effects:
 * Dark Pulse deals damage and has a 20% chance of causing the target to
 * flinch (if the target has not yet moved).
 * Pokémon with the ability Inner Focus or those behind a Substitute
 * cannot be made to flinch.
 */

package attacks;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public final class DarkPulse extends ru.ifmo.se.pokemon.SpecialMove
{
    public DarkPulse()
    {
        // Type: DARK, Power: 80, Accuracy: 100
        super(Type.DARK, 80, 100);
    }

    /*
     * 20% chance of causing the target to flinch
     */
    @Override protected void applyOppEffects(Pokemon p)
    {
        Random random_generator = new Random();
        // nextInt will generate integers from: [0; 10)
        if (random_generator.nextInt(10) < 2)
            Effect.flinch(p);
    }

    @Override protected String describe()
    {
        return "Dark Pulses";
    }
}
