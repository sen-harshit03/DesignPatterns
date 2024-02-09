package org.example.creational.factoryMethod.example1;

import org.example.creational.factoryMethod.example1.products.Vehicle;
import org.example.creational.factoryMethod.example1.store.VehicleStore;

public class Client {

    public static void main(String[] args) {
        VehicleStore store = new VehicleStore();
        Vehicle vehicle = store.getVehicle(2);
    }
}
