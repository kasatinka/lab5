package commands;

import console.Console;

public class PrintAscendingCommand extends Command {
    public PrintAscendingCommand(Console console) {
        super("print_ascending", "Displays all the elements sorted", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
