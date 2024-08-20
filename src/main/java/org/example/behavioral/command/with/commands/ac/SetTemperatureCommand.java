package org.example.behavioral.command.with.commands.ac;

import org.example.behavioral.command.with.AirConditioner;
import org.example.behavioral.command.with.commands.Command;

public class SetTemperatureCommand implements Command {

    private final AirConditioner airConditioner;
    private int temperature;

    public SetTemperatureCommand(AirConditioner airConditioner, int temperature) {
        this.airConditioner = airConditioner;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        airConditioner.setTemperature(temperature);
    }
}
