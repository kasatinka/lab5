package commands;

import console.Console;

public class HelpCommand extends Command {
    public HelpCommand(Console console) {
        super("help", "Displays this message", console);
    }

    @Override
    public boolean execute() {
        for (Command c : console.getCommandList()) {
            console.writef("%-37s", c.getName());
            console.writeLine(c.getDescription());
        }
        return true;
    }
}
