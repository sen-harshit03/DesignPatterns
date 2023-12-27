package org.example.behavioral.strategy.with.heal;

public class NoHealing implements HealingStrategy {
    @Override
    public void heal() {
        System.out.println("I cannot heal");
    }
}
