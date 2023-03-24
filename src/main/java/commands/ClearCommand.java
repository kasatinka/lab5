package commands;

import console.Console;
import data.SpaceMarine;

import java.util.ArrayDeque;

public class ClearCommand extends Command {
    public ClearCommand(Console console) {
        super("clear", "Clears the collection", console);
    }

    @Override
    public boolean execute() {
        console.getCollectionManager().setMarinesCollection(new ArrayDeque<SpaceMarine>());
        return true;
    }
}
