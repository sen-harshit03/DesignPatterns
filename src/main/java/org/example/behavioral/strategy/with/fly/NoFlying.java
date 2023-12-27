package org.example.behavioral.strategy.with.fly;

public class NoFlying implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
