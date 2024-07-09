package org.example.creational.abstract_factory.product.italian;

import org.example.creational.abstract_factory.product.Pizza;

public class ItalianVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing italian veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking italian veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting italian veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing italian veggie pizza");
    }
}
