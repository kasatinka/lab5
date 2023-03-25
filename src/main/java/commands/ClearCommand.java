package commands;

import console.Console;

public class ClearCommand extends Command {
    public ClearCommand(Console console) {
        super("clear", "Clears the collection", console);
    }

    @Override
    public boolean execute() {
        //.setMarinesCollection(new ArrayDeque<SpaceMarine>());
        return true;
    }
}
