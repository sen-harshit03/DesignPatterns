package org.example.behavioral.command.with;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Current temp is : " + temperature);
    }


    public void turnOffAC() {
        this.isOn = false;
        System.out.println("Turning off AC");
    }

    public void turnOnAC() {
        this.isOn = true;
        System.out.println("Turning on AC");
    }
}
