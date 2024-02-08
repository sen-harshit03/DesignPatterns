package org.example.structural.decorator.example1.pizza;

public class NonVegPizza extends Pizza {

    public NonVegPizza() {
        description = "Non-veg Pizza";
    }

    @Override
    public double cost() {
        return 150.00;
    }
}
