package org.example.creational.abstract_factory.product.italian;

import org.example.creational.abstract_factory.product.Pizza;

public class ItalianCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing italian cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking italian cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting italian cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing italian cheese pizza");
    }
}
