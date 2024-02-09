package org.example.creational.factoryMethod.example1.factory;

import org.example.creational.factoryMethod.example1.products.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(int wheels);
}
