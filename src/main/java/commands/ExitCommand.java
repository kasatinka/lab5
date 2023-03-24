package commands;

import console.Console;

public class ExitCommand extends Command {
    public ExitCommand(Console console) {
        super("exit", "exits the program (no saving (no refunds))", console);
    }

    @Override
    public boolean execute() {
        console.close();
        return false;
    }
}
