package org.example.behavioral.command.without;

import org.example.behavioral.command.without.AirConditioner;

public class Remote {

    private AirConditioner airConditioner;

    public Remote(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    public void turnOnAC() {
        airConditioner.turnOnAC();
    }

    public void turnOffAC() {
        airConditioner.turnOffAC();
    }

    public void setTemperature(int temperature) {
        airConditioner.setTemperature(temperature);
    }
}
