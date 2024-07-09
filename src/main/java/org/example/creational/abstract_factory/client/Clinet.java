package org.example.creational.abstract_factory.client;

import org.example.creational.abstract_factory.product.Pizza;
import org.example.creational.abstract_factory.store.IndianPizzaStore;
import org.example.creational.abstract_factory.store.ItalianPizzaStore;
import org.example.creational.abstract_factory.store.PizzaStore;

/**
 * All factory patterns encapsulate object creation. The Factory Method Pattern encapsulates
 * object creation by letting subclasses decide what objects to create.
 */
public class Clinet {
    public static void main(String[] args) {

        PizzaStore  indianStore = new IndianPizzaStore();
        PizzaStore italianStore = new ItalianPizzaStore();


        Pizza pizza1 = indianStore.orderPizza("cheese");
        Pizza pizza2 = italianStore.orderPizza("veggie");


    }
}

/**
 *  abstract creator class (PizzaStore)
 *     -> Concrete creator classes (IndianPizzaStore, ItalianPizzaStore)
 *
 *  abstract Product class (Pizza)
 *      -> Multiple concrete classes (IndianCheesePizza, ItalianCheesePizza...)
 */
