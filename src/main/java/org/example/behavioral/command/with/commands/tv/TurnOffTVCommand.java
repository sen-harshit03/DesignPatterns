package org.example.behavioral.command.with.commands.tv;

import org.example.behavioral.command.with.commands.Command;
import org.example.behavioral.command.with.Television;

public class TurnOffTVCommand implements Command {

    private Television television;

    public TurnOffTVCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
