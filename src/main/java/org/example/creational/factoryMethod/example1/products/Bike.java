package org.example.creational.factoryMethod.example1.products;

public class Bike extends Vehicle {

    @Override
    public void buildChasis() {
        System.out.println("Building bike chasis");
    }

    @Override
    public void buildBody() {
        System.out.println("Building bike body");
    }

    @Override
    public void applyPaint() {
        System.out.println("Applying paint to the bike");
    }

    @Override
    public void addAccessories() {
        System.out.println("Adding Accessories to the bike");
    }
}
