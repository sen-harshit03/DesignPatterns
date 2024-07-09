package org.example.creational.factory_method.fac;

import org.example.creational.factory_method.product.CheesePizza;
import org.example.creational.factory_method.product.PepperoniPizza;
import org.example.creational.factory_method.product.Pizza;
import org.example.creational.factory_method.product.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        // Object creation code (Varies with the type)
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
