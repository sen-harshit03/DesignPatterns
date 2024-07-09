package org.example.creational.abstract_factory.store;

import org.example.creational.abstract_factory.product.Pizza;
import org.example.creational.abstract_factory.product.indian.IndianCheesePizza;
import org.example.creational.abstract_factory.product.indian.IndianPepperoniPizza;
import org.example.creational.abstract_factory.product.indian.IndianVeggiePizza;
import org.example.creational.abstract_factory.product.italian.ItalianCheesePizza;
import org.example.creational.abstract_factory.product.italian.ItalianPepperoniPizza;
import org.example.creational.abstract_factory.product.italian.ItalianVeggiePizza;

public class ItalianPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ItalianCheesePizza();
        } else if (type.equals("pepperoni")) {
            return new ItalianPepperoniPizza();
        } else if (type.equals("veggie")) {
            return new ItalianVeggiePizza();
        }
        return null;
    }
}
