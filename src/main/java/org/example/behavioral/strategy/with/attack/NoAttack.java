package org.example.behavioral.strategy.with.attack;

public class NoAttack implements AttackingStrategy{
    @Override
    public void attack() {
        System.out.println("Cannot attack");
    }
}
