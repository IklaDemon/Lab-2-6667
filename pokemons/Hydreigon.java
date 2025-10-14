package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.BrutalSwing;

public final class Hydreigon extends Zweilous
{
    public Hydreigon(String name, int level)
    {
        super(name, level);
        this.setStats(92, 105, 90, 125, 90, 98);
        this.setType(Type.DARK, Type.DRAGON);
        this.addMove(new BrutalSwing());
    }
}
