package org.example.creational.factoryMethod.example1.products;

public class Car extends Vehicle {

    @Override
    public void buildChasis() {
        System.out.println("Building car chasis");
    }

    @Override
    public void buildBody() {
        System.out.println("Building car body");
    }

    @Override
    public void applyPaint() {
        System.out.println("Applying paint to the car");
    }

    @Override
    public void addAccessories() {
        System.out.println("Adding Accessories to the car");
    }
}
