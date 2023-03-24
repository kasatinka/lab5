package commands;

import console.Console;

public class SaveCommand extends Command {
    public SaveCommand(Console console) {
        super("save", "Saves the collection to a file", console);
    }

    @Override
    public boolean execute() {
        console.writeLine(console.getCollectionManager().saveToFile());
        return true;
    }
}
