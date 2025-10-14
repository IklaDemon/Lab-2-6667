/*
 * Type: NORMAL
 * Category: Physical
 * Power: 35
 * Accuracy: 90
 * 
 * Double Hit deals damage and will strike twice (with 35 base power each
 * time).
 * Each strike of Double Hit is treated like a separate attack:
 * Each strike can get a critical hit independently.
 * Abilities that activate on contact (Static, Weak Armor, Iron Barbs etc.)
 * activate for each strike.
 * If the Sturdy ability, Focus Sash, or Focus Band activates before the
 * final hit, the subsequent hit will still deal damage and therefore cause
 * the opponent to faint.
 * If the first hit breaks a Substitute, the second hit will deal damage to
 * the target Pokémon.
 * The move Counter only counters the final hit, but Bide counters the
 * complete damage.
 */

package attacks;

import ru.ifmo.se.pokemon.*;

public final class DoubleHit extends ru.ifmo.se.pokemon.PhysicalMove
{
    public DoubleHit()
    {
        // Type: NORMAL, Power: 35, Accuracy: 90
        super(Type.NORMAL, 35, 90, 0, 1);
    }

    @Override protected String describe()
    {
        return "Double Hits";
    }
}