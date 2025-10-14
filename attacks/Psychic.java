/*
 * Type: PSYCHIC
 * Category: Special
 * Power: 90
 * Accuracy: 100
 * 
 * Effects:
 * Psychic deals damage and has a 10% chance of lowering the target's
 * Special Defense by one stage.
 * Stats can be lowered to a minimum of -6 stages each.
 */

package attacks;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public final class Psychic extends ru.ifmo.se.pokemon.SpecialMove
{
    public Psychic()
    {
        // Type: PSYCHIC, Power: 90, Accuracy: 100
        super(Type.PSYCHIC, 90, 100);
    }

    @Override protected void applyOppEffects(Pokemon p)
    {
        Random random_generator = new Random();
        // nextInt will generate integers from: [0; 10)
        if (random_generator.nextInt(10) < 1)
        {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override protected String describe()
    {
        return "Psychics";
    }
}
