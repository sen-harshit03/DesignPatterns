package org.example.behavioral.strategy.with.heal;

public class NaturalHealing implements HealingStrategy{
    @Override
    public void heal() {
        System.out.println("I can heal");
    }
}
