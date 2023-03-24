package commands;

import console.Console;

public class ExitCommand extends Command {
    public ExitCommand(Console console) {
        super("exit", "Exits the program without saving", console);
    }

    @Override
    public boolean execute() {
        console.close();
        return false;
    }
}
