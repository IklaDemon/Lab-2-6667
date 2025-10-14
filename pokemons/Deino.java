package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.DarkPulse;
import attacks.ThunderWave;

public class Deino extends ru.ifmo.se.pokemon.Pokemon
{
    public Deino(String name, int level)
    {
        super(name, level);
        this.setStats(52, 65, 50, 45, 50, 38);
        this.setType(Type.DARK, Type.DRAGON);
        this.addMove(new ThunderWave());
        this.addMove(new DarkPulse());
    }
}
