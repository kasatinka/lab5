package utility;

import commands.Command;

public class CommandRunner {

    public boolean executeCommand(Command command) {
        return command.execute();
    }
}
