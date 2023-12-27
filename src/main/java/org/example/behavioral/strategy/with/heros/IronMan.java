package org.example.behavioral.strategy.with.heros;

import org.example.behavioral.strategy.with.attack.MeleeAttacking;
import org.example.behavioral.strategy.with.attack.SuitAttacking;
import org.example.behavioral.strategy.with.fly.NaturalFlying;
import org.example.behavioral.strategy.with.fly.SuitFlying;
import org.example.behavioral.strategy.with.heal.NoHealing;

public class IronMan extends SuperHero {

    public IronMan() {
        flyingStrategy = new SuitFlying();
        attackingStrategy = new SuitAttacking();
        healingStrategy = new NoHealing();
    }
}
