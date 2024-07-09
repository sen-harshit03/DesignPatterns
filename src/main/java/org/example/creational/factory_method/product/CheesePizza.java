package org.example.creational.factory_method.product;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheese pizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting cheese pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing cheese pizza");
    }
}
