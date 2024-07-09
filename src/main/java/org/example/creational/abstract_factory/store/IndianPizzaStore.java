package org.example.creational.abstract_factory.store;

import org.example.creational.abstract_factory.product.Pizza;
import org.example.creational.abstract_factory.product.indian.IndianCheesePizza;
import org.example.creational.abstract_factory.product.indian.IndianPepperoniPizza;
import org.example.creational.abstract_factory.product.indian.IndianVeggiePizza;
import org.example.creational.factory_method.fac.SimplePizzaFactory;

public class IndianPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new IndianCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new IndianPepperoniPizza();
        } else if (type.equals("veggie")) {
            return new IndianVeggiePizza();
        }
        return null;
    }
}
