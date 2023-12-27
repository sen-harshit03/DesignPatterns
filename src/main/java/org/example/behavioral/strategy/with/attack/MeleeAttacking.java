package org.example.behavioral.strategy.with.attack;

public class MeleeAttacking implements AttackingStrategy {
    @Override
    public void attack() {
        System.out.println("Attack with melee weapons");
    }
}
