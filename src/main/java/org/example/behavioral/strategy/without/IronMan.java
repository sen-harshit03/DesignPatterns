package org.example.behavioral.strategy.without;

public class IronMan implements SuperHero {

    @Override
    public void attack() {
        System.out.println("Attack with Suit");
    }

    @Override
    public void fly() {
        System.out.println("Fly with suit");
    }

    @Override
    public void heal() {

    }
}
