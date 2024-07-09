package org.example.creational.abstract_factory.product;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Veggie pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Veggie pizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting Veggie pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Veggie pizza");
    }
}
