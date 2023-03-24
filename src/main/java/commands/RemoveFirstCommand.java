package commands;

import console.Console;

public class RemoveFirstCommand extends Command {
    public RemoveFirstCommand(Console console) {
        super("remove_first", "Removes the first element from the collection", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
