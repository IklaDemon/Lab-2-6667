/*
 * Type: DARK
 * Category: Physical
 * Power: 60
 * Accuracy: 100
 * 
 * Effects:
 * The user swings its body around violently to inflict damage on
 * everything in its vicinity.
 */

package attacks;

import ru.ifmo.se.pokemon.*;

public final class BrutalSwing extends ru.ifmo.se.pokemon.PhysicalMove
{
    public BrutalSwing()
    {
        // Type: DARK, Power: 60, Accuracy: 100
        super(Type.DARK, 60, 100);
    }

    @Override protected String describe()
    {
        return "Brutal Swings";
    }
}
