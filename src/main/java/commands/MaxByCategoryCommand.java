package commands;

import console.Console;

public class MaxByCategoryCommand extends Command {
    public MaxByCategoryCommand(Console console) {
        super("max_by_category", "Displays a collection element that has a maximum category field", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
