package org.example.behavioral.command.without;

public class Client {
    private static Remote remote;
    private static AirConditioner airConditioner;

    public static void main(String[] args) {
        airConditioner = new AirConditioner();
        remote =  new Remote(airConditioner);

        remote.turnOnAC();
        remote.setTemperature(25);
        remote.turnOffAC();

        /**
         * What's wrong in this??
         * - Remote is tightly coupled with AirConditioner, If we need to control TV, Fans, and other
         *   appliances, then we have to create separate remote class for each device, this leads to duplication
         *
         * - No undo/redo operations can be performed
         * - If we want to add new functionality, such as "SleepMode" then we have to make changes in the Remote class too
         *     violating OCP.
         */
    }
}
