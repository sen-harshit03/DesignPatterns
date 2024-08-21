package org.example.behavioral.template;

public class Tea extends Beverage {

    @Override
    public void brewOrSteep() {
        System.out.println("Steeping tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }
}
