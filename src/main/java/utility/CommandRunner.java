package utility;

import commands.Command;

public class CommandRunner {

    public void executeCommand(Command command, String argument) {
        command.execute();
    }

}
