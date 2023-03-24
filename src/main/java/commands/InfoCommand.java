package commands;

import console.Console;

public class InfoCommand extends Command {
    public InfoCommand(Console console) {
        super("info", "Displays information about the collection", console);
    }

    public boolean execute() {
        return false;
    }
}
