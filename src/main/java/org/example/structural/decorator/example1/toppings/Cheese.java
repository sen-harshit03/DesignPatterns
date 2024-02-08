package org.example.structural.decorator.example1.toppings;

import org.example.structural.decorator.example1.pizza.Pizza;

public class Cheese extends ToppingsDecorator {
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 10.00 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with cheese";
    }
}
