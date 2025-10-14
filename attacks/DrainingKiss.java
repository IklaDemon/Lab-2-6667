/*
 * Type: FAIRY
 * Category: Special
 * Power: 50
 * Accuracy: 100
 * 
 * Effects:
 * Draining Kiss deals damage and the user will recover 75% of the HP
 * drained.
 */

package attacks;

import ru.ifmo.se.pokemon.*;

public final class DrainingKiss extends ru.ifmo.se.pokemon.SpecialMove
{
    public DrainingKiss()
    {
        // Type: FAIRY, Power: 50, Accuracy: 100
        super(Type.FAIRY, 50, 100);
    }

    /*
     * Draining Kiss has no effect into the target (defending Pokemon)
     */
    @Override protected void applyOppEffects(Pokemon p)
    {
        ;
    }

    /*
     * Draining Kiss deals damage (power = 50) and the user will recover 75% of the HP drained.
     * but I think this is not the right method to recover the health...
     */
    @Override protected void applySelfEffects(Pokemon p)
    {
        ;
    }

    /*
     * A method that applies calculated damage to the attacking Pokémon. By default, it does nothing.
     * For attacks where the attacking Pokémon also takes damage, it must be overridden.
     * From here I could get the 75% HP from the "HP drainign"... if the "HP draining" refers to the damage dealt...
     */
    @Override protected void applySelfDamage(Pokemon att, double damage)
    {
        //System.out.println(att.toString() + ":DrainingKiss.applySelfDamage:" + damage);
        //System.out.println(att.toString() + ":DrainingKiss.applySelfDamage: HP: " + att.getHP());

        //Effect e = new Effect().chance(1).turns(0).stat(Stat.HP, (int)((-1.0) * (damage * 0.75)));
        //att.addEffect(e);
        // This method can add health even beyond the max HP... isn't this broken? I could not find a method to get the current max HP...
        att.setMod(Stat.HP, (int)((-1.0) * (damage * 0.75)));

        //System.out.println(att.toString() + ":DrainingKiss.applySelfDamage: HP: " + att.getHP());
    }

    @Override protected String describe()
    {
        return "Drain Kisses";
    }
}