package org.example.behavioral.strategy.with.attack;

public class SuitAttacking implements AttackingStrategy{
    @Override
    public void attack() {
        System.out.println("Attack with suit");
    }
}
