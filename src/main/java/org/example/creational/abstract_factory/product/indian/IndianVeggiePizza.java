package org.example.creational.abstract_factory.product.indian;

import org.example.creational.abstract_factory.product.Pizza;

public class IndianVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing indian veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking indian veggie pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting indian veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing indian veggie pizza");
    }
}
