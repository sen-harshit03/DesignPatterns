package org.example.behavioral.strategy.with.fly;

public class SuitFlying implements FlyingStrategy{
    @Override
    public void fly() {
        System.out.println("Can fly with suit");
    }
}
