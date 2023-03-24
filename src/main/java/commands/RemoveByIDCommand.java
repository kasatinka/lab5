package commands;

import console.Console;

public class RemoveByIDCommand extends Command {
    public RemoveByIDCommand(Console console) {
        super("remove_by_id", "Removes the element with the matching ID", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
