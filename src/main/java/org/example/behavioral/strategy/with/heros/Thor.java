package org.example.behavioral.strategy.with.heros;

import org.example.behavioral.strategy.with.attack.MeleeAttacking;
import org.example.behavioral.strategy.with.fly.NaturalFlying;
import org.example.behavioral.strategy.with.heal.NoHealing;

public class Thor extends SuperHero {

    public Thor() {
        flyingStrategy = new NaturalFlying();
        attackingStrategy = new MeleeAttacking();
        healingStrategy = new NoHealing();
    }
}
