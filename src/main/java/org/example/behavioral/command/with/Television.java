package org.example.behavioral.command.with;

public class Television {
    private boolean isOn;

    public void turnOn() {
        this.isOn = true;
        System.out.println("Turning on TV");
    }

    public void turnOff() {
        this.isOn = false;
        System.out.println("Turning off TV");

    }
}
