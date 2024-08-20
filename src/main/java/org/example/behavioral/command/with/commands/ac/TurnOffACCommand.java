package org.example.behavioral.command.with.commands.ac;

import org.example.behavioral.command.with.AirConditioner;
import org.example.behavioral.command.with.commands.Command;

public class TurnOffACCommand implements Command {

    private final AirConditioner airConditioner;

    public TurnOffACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOffAC();
    }
}
