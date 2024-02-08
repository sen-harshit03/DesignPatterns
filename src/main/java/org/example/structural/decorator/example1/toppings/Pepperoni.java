package org.example.structural.decorator.example1.toppings;

import org.example.structural.decorator.example1.pizza.Pizza;

public class Pepperoni extends ToppingsDecorator {

    private final Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return 15 + pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with pepperoni";
    }
}
