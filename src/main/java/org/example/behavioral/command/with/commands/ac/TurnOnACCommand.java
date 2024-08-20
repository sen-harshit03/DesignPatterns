package org.example.behavioral.command.with.commands.ac;

import org.example.behavioral.command.with.AirConditioner;
import org.example.behavioral.command.with.commands.Command;

public class TurnOnACCommand implements Command {

    private final AirConditioner airConditioner;

    public TurnOnACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOnAC();
    }
}
