package org.example.structural.decorator.example1;

import org.example.structural.decorator.example1.pizza.NonVegPizza;
import org.example.structural.decorator.example1.pizza.Pizza;
import org.example.structural.decorator.example1.pizza.VegPizza;
import org.example.structural.decorator.example1.toppings.Cheese;
import org.example.structural.decorator.example1.toppings.Onion;
import org.example.structural.decorator.example1.toppings.Pepperoni;

/**
 *  Decorator IS A 'component' and HAS A 'component';
 *  HAS A - is to add the responsibilities/behaviour at the runtime.
 *  IS A - we are using this just for 'type matching' not to add behaviour at runtime.
 *
 *  Decorator needs to be 'something' which it is decorating. So we used inheritance for type matching.
 *
 *  Decorator acts a wrapper: which means it can wrap a decorator, it can wrap a base component, it can wrap a series of decorators
 *
 *  decor1(decor2(decor3(baseComponent)))
 *  baseComponent
 *  decor1(decor1(baseComponent))
 *
 *  we can have any number of combinations with it.
 *
 *  Decorator sucks:
 *  1. It makes the whole thing complex, as we can have as many wrappers we want.
 *  2. Instantiation of each and every decorators each time is the pain in the ass.
 *  3. If we have to follow some ordering while decorating it can be most flexible design.
 *
 */
public class Main {

    public static void main(String[] args) {
        Pizza pizza = new VegPizza();
        System.out.println("Cost: " + pizza.cost() + "    Description: " + pizza.getDescription());

        Pizza vegPizza = new VegPizza();
        vegPizza = new Pepperoni(vegPizza);
        vegPizza = new Cheese(vegPizza);
        System.out.println("Cost: " + vegPizza.cost() + "    Description: " + vegPizza.getDescription());

        Pizza nonVegPizza = new NonVegPizza();   // 150
        nonVegPizza = new Pepperoni(nonVegPizza);  // 15
        nonVegPizza = new Pepperoni(nonVegPizza);  // 15
        nonVegPizza = new Cheese(nonVegPizza);   // 10
        System.out.println("Cost: " + nonVegPizza.cost() + "    Description: " + nonVegPizza.getDescription());

        Pizza onionPizza = new VegPizza();
        onionPizza = new Onion(onionPizza);
        onionPizza = new Cheese(onionPizza);

        System.out.println("Cost: " + onionPizza.cost() + "    Description: " + onionPizza.getDescription());






    }


}
