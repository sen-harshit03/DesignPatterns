package org.example.behavioral.strategy.with.heros;

import org.example.behavioral.strategy.with.attack.MeleeAttacking;
import org.example.behavioral.strategy.with.attack.NoAttack;
import org.example.behavioral.strategy.with.fly.NaturalFlying;
import org.example.behavioral.strategy.with.fly.NoFlying;
import org.example.behavioral.strategy.with.heal.HealingStrategy;
import org.example.behavioral.strategy.with.heal.NaturalHealing;
import org.example.behavioral.strategy.with.heal.NoHealing;

public class Groot extends SuperHero {

    public Groot() {
        flyingStrategy = new NoFlying();
        attackingStrategy = new NoAttack();
        healingStrategy = new NaturalHealing();
    }
}
