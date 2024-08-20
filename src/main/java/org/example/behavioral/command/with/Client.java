package org.example.behavioral.command.with;

import org.example.behavioral.command.with.commands.Command;
import org.example.behavioral.command.with.commands.ac.SetTemperatureCommand;
import org.example.behavioral.command.with.commands.ac.TurnOffACCommand;
import org.example.behavioral.command.with.commands.ac.TurnOnACCommand;
import org.example.behavioral.command.with.commands.tv.TurnOffTVCommand;
import org.example.behavioral.command.with.commands.tv.TurnOnTVCommand;

/**
 * By using Command design pattern,  we can decouple invoker(Remote) with receiver(AirConditioner)
 *
 * Step 1: Define a Command Interface
 * Step 2: Create concrete classes of command and in that call the appliance method.
 * Step 3: Add dependency of the Command to remote.
 * Step 4: Add method which will call the other command's method.
 */
public class Client {

    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        Television television = new Television();

        /**
         * Commands
         */
        Command turnOnAcCommand = new TurnOnACCommand(airConditioner);
        Command turnOffAcCommand = new TurnOffACCommand(airConditioner);
        Command setTemperatureCommand = new SetTemperatureCommand(airConditioner, 24);
        Command turnOnTvCommand = new TurnOnTVCommand(television);
        Command turnOffTvCommand = new TurnOffTVCommand(television);

        // Turning AC - ON
        Remote remote = new Remote(turnOnAcCommand);
        remote.pressButton();

        // Setting AC temperature
        remote.setCommand(setTemperatureCommand);
        remote.pressButton();

        // Turning AC - OFF
        remote.setCommand(turnOffAcCommand);
        remote.pressButton();

        // Turning TV - ON
        remote.setCommand(turnOnTvCommand);
        remote.pressButton();

        // Turning TV - OFF
        remote.setCommand(turnOffTvCommand);
        remote.pressButton();
    }
}
