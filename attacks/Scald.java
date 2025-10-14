/*
 * Type: WATER
 * Category: Special
 * Power: 80
 * Accuracy: 100
 * 
 * Effects:
 * Scald deals damage and has a 30% chance of burning the target.
 * Fire type Pokémon, those with the ability Water Veil or those behind
 * a Substitute cannot be burned.
 * If the user is frozen, Scald can be used and will thaw out the Pokémon
 * before attacking.
 */

package attacks;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public final class Scald extends ru.ifmo.se.pokemon.SpecialMove
{
    public Scald()
    {
        // Type: WATER, Power: 80, Accuracy: 100
        super(Type.WATER, 80, 100);
    }

    /*
     * Check if the pockemon is frozen, if it is, it gets unfrozen
     */
    @Override protected void applySelfEffects(Pokemon p)
    {
        //System.out.println(p.getCondition());
        if (p.getCondition() == Status.FREEZE)
            p.setCondition(new Effect().condition(Status.NORMAL));
    }

    /*
     * Applies burning to the Defending Pokemon
     * 
     * NOTE: A burn status in the main video games is a non-volatile status
     * that lasts until the Pokémon is HEALED!!!
     */
    @Override protected void applyOppEffects(Pokemon p)
    {
        Random random_generator = new Random();
        // nextInt will generate integers from: [0; 10)
        if (random_generator.nextInt(10) < 3)
            Effect.burn(p);
    }

    @Override protected String describe()
    {
        return "Scalds";
    }
}
