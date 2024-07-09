package org.example.creational.abstract_factory.product.indian;

import org.example.creational.abstract_factory.product.Pizza;

public class IndianCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing indian cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking indian cheese pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting indian cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing indian cheese pizza");
    }
}
