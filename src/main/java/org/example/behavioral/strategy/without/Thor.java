package org.example.behavioral.strategy.without;

public class Thor implements SuperHero {
    @Override
    public void attack() {
        System.out.println("Attack with melee weapons");
    }

    @Override
    public void fly() {
        System.out.println("Natural Flying");
    }

    @Override
    public void heal() {

    }
}
