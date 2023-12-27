package org.example.behavioral.strategy.with.fly;

public class NaturalFlying implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Can fly naturally");
    }
}
