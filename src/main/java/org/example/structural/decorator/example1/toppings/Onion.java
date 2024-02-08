package org.example.structural.decorator.example1.toppings;

import org.example.structural.decorator.example1.pizza.Pizza;

/**
 * Onion is 'Pizza' and it has a 'Pizza'
 *
 * - Decorator is a 'decorator' and has a 'decorator'
 */
public class Onion extends Pizza {

    private final Pizza pizza;

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }


    public String getDescription() {
        return pizza.getDescription() + " with onion";
    }
    @Override
    public double cost() {
        return 10 + pizza.cost();
    }
}
