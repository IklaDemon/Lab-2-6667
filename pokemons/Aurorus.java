package pokemons;

import attacks.Psychic;
import ru.ifmo.se.pokemon.*;

public final class Aurorus extends Amaura
{
    public Aurorus(String name, int level)
    {
        super(name, level);
        // hp, attack, defence, special attack, special defence, speed
        this.setStats(123, 77, 72, 99, 92, 58);
        this.setType(Type.ROCK, Type.ICE);
        this.addMove(new Psychic());
    }
}
