package commands;

import console.Console;

public class AddCommand extends Command {
    public AddCommand(Console console) {
        super("add", "Brings up a dialog to add a new SpaceMarine to the collection", console);
    }

    @Override
    public boolean execute() {
        console.writeLine("Adding new marine...");


        return true;
    }
}
