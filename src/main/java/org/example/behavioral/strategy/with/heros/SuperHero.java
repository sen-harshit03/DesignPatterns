package org.example.behavioral.strategy.with.heros;

import org.example.behavioral.strategy.with.attack.AttackingStrategy;
import org.example.behavioral.strategy.with.fly.FlyingStrategy;
import org.example.behavioral.strategy.with.heal.HealingStrategy;

public abstract class SuperHero {

    public FlyingStrategy flyingStrategy;
    public AttackingStrategy attackingStrategy;
    public HealingStrategy healingStrategy;

    public void setAttackingStrategy() {
        attackingStrategy.attack();
    }

    public void setFlyingStrategy() {
        flyingStrategy.fly();
    }

    public void setHealingStrategy() {
        healingStrategy.heal();
    }

}
