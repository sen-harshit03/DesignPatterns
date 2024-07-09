package org.example.creational.factoryMethod.example1.store;

import org.example.creational.factoryMethod.example1.factory.VehicleFactory;
import org.example.creational.factoryMethod.example1.factory.VehicleFactoryImpl;
import org.example.creational.factoryMethod.example1.products.Vehicle;

public class VehicleStore {

    private VehicleFactory vehicleFactory;

    public Vehicle getVehicle(int wheels) {
/**
 *         These piece of code varies on the no of the wheels
 *         The thing which varies with some 'type' encapsulate that piece of code.
 *         replace the new -> some "method" which have the object creation logic
 */
//        Vehicle vehicle = null;
//        if(wheels == 2) {
//            vehicle = new Bike();
//        } else if(wheels == 4) {
//            vehicle = new Car();
//        } else if (wheel == 10) {

        VehicleFactory factory = new VehicleFactoryImpl();
        Vehicle vehicle = factory.createVehicle(wheels);

        // These are responsibilities which we expect to remain same
        vehicle.buildChasis();
        vehicle.buildBody();
        vehicle.applyPaint();
        vehicle.addAccessories();

        return vehicle;
    }
}
