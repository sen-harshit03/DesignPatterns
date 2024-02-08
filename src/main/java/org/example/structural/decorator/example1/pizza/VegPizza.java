package org.example.structural.decorator.example1.pizza;

public class VegPizza extends Pizza {

    public VegPizza() {
        description = "VegPizza";
    }
    @Override
    public double cost() {
        return 100.00;
    }
}
