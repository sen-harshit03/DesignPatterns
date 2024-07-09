package org.example.creational.factoryMethod.example1.factory;

import org.example.creational.factoryMethod.example1.products.Bike;
import org.example.creational.factoryMethod.example1.products.Car;
import org.example.creational.factoryMethod.example1.products.Vehicle;

public class VehicleFactoryImpl implements VehicleFactory {
    @Override
    public Vehicle createVehicle(int wheels) {
        if(wheels == 2) {
            return new Bike();
        } else if(wheels == 4) {
            return new Car();
        }
        return null;
    }
}
