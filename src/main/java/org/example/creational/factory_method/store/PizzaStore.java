package org.example.creational.factory_method.store;

import org.example.creational.factory_method.fac.SimplePizzaFactory;
import org.example.creational.factory_method.product.CheesePizza;
import org.example.creational.factory_method.product.PepperoniPizza;
import org.example.creational.factory_method.product.Pizza;
import org.example.creational.factory_method.product.VeggiePizza;

/**
 *  Here orderPizza has two different responsibilities"
 *  1. Object creation : varies with "type" received as the parameter
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

    /**
     * Encapsulated the object creation code, within the same class.
     * This is static factory pattern
     */
//    private Pizza createPizza(String type) {
//        Pizza pizza = null;
//
//        // Object creation code (Varies with the type)
//        if (type.equals("cheese")) {
//            pizza = new CheesePizza();
//        } else if (type.equals("pepperoni")) {
//            pizza = new PepperoniPizza();
//        } else if (type.equals("veggie")) {
//            pizza = new VeggiePizza();
//        }
//        return pizza;
//    }
}
