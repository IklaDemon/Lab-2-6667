/*
 * Type: ROCK
 * Category: Physical
 * Power: 100
 * Accuracy: 80
 * 
 * Effects:
 * Stone Edge deals damage and has an increased critical hit ratio
 * (1/8 instead of 1/24).
 */

package attacks;

import ru.ifmo.se.pokemon.*;
import java.util.Random;

public final class StoneEdge extends ru.ifmo.se.pokemon.SpecialMove
{
    public StoneEdge()
    {
        // Type: ROCK, Power: 100, Accuracy: 80
        super(Type.ROCK, 100, 80);
    }

    /*
     * A method that takes into account the probability and power of a
     * critical hit.
     * The standard probability is the Pokémon's effective speed / 512.
     * The standard critical hit power is twice the normal power.
     */
    @Override protected double calcCriticalHit( Pokemon  att, Pokemon  def)
    {
        Random random_generator = new Random();
        // nextInt will generate integers from: [0; 8)
        if (random_generator.nextInt(8) == 0)
            return 2;
        return 1;
    }

    @Override protected String describe()
    {
        return "Stone Edges";
    }
}