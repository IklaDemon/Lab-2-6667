package pokemons;

import ru.ifmo.se.pokemon.*;
import attacks.DarkPulse;
import attacks.FrostBreath;
import attacks.StoneEdge;

public class Amaura extends ru.ifmo.se.pokemon.Pokemon
{
    public Amaura(String name, int level)
    {
        super(name, level);
        // hp, attack, defence, special attack, special defence, speed
        this.setStats(77, 59, 50, 67, 63, 46);
        this.setType(Type.ROCK, Type.ICE);
        this.addMove(new StoneEdge());
        this.addMove(new DarkPulse());
        this.addMove(new FrostBreath());
    }
}
