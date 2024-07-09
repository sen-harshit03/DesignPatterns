package org.example.creational.factory_method.product;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Pepperoni pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Pepperoni pizza");

    }

    @Override
    public void cut() {
        System.out.println("Cutting Pepperoni pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Pepperoni pizza");
    }
}
