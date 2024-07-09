package org.example.creational.factory_method.store;

import org.example.creational.factory_method.fac.SimplePizzaFactory;
import org.example.creational.factory_method.product.Pizza;

/**
 *  Here order pizza has two different responsibilities"
 *  1. Object creation : varies with "type" received as the paramenter
 *  2. Making of pizza : remains same for all type of pizza.
 *
 *  As per the design principle, the code logic which varies, that should be encapsulated.
 *
 */

public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }
    public Pizza orderPizza(String type) {
        // Encapsulate the code which varies with the type
        Pizza pizza = simplePizzaFactory.createPizza(type);

        // This logic remains the same for all type of pizza.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
