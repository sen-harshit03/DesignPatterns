package org.example.creational.abstract_factory.store;

import org.example.creational.abstract_factory.product.Pizza;
import org.example.creational.factory_method.fac.SimplePizzaFactory;

/**
 *  Here order pizza has two different responsibilities"
 *  1. Object creation : varies with "type" received as the paramenter
 *  2. Making of pizza : remains same for all type of pizza.
 *
 *  As per the design principle, the code logic which varies, that should be encapsulated.
 *
 */

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        // Encapsulate the code which varies with the type
        Pizza pizza = createPizza(type);

        // This logic remains the same for all type of pizza.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(String type);

}
