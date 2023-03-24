package commands;

import console.Console;

public class UpdateCommand extends Command {
    public UpdateCommand(Console console) {
        super("update", "Brings up a dialog to update an existing SpaceMarine in the collection", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
