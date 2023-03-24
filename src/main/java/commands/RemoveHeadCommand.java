package commands;

import console.Console;

public class RemoveHeadCommand extends Command {
    public RemoveHeadCommand(Console console) {
        super("remove_head", "Removes the first element from the collection after displaying it", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
