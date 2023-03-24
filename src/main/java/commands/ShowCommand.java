package commands;

import console.Console;

public class ShowCommand extends Command {
    public ShowCommand(Console console) {
        super("show", "Displays all the elements stored in a collection", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
