/*
 * Type: ICE
 * Category: Special
 * Power: 60
 * Accuracy: 90
 * 
 * Effects:
 * Frost Breath deals damage and always results in a critical hit,
 * increasing its power to 90.
 * Pokémon with the abilities Battle Armor or Shell Armor, or those under
 * the effect of Lucky Chant are immune to critical hits so Frost Breath
 * will hit them with base power 60.
 */

package attacks;

import ru.ifmo.se.pokemon.*;

public final class FrostBreath extends ru.ifmo.se.pokemon.SpecialMove
{
    public FrostBreath()
    {
        // Type: DARK, Power: 80, Accuracy: 100
        super(Type.ICE, 60, 90);
    }

    /*
     * Frost Breath deals damage and always results in a critical hit,
     * increasing its power to 90.
     */
    @Override protected double calcCriticalHit( Pokemon  att, Pokemon  def)
    {
        return 2;
    }

    @Override protected String describe()
    {
        return "Frost Breathes";
    }
}
