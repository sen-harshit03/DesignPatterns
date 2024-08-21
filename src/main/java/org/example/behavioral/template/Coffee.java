package org.example.behavioral.template;

public class Coffee extends Beverage {
    @Override
    public void brewOrSteep() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
