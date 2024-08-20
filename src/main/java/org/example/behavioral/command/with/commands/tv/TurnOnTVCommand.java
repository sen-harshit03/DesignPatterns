package org.example.behavioral.command.with.commands.tv;

import org.example.behavioral.command.with.commands.Command;
import org.example.behavioral.command.with.Television;

public class TurnOnTVCommand implements Command {

    private Television television;

    public TurnOnTVCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
