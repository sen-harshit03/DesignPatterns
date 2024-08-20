package org.example.behavioral.command.with;

import org.example.behavioral.command.with.commands.Command;

public class Remote {

    private Command command;

    public Remote(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
