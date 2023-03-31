package commands;

import console.Console;

public class HelpCommand extends Command {
    public HelpCommand(Console console) {
        super("help", "Displays this message", console);
    }

    @Override
    public boolean execute() {
        String inputArgument = console.getInputArgument();
        if (inputArgument.isEmpty()) {
            for (Command c : console.getCommandList()) {
                console.writef("%-37s", c.getName());
                console.writeLine(c.getDescription());
            }
        } else {
            boolean done = false;
            for (Command c : console.getCommandList()) {
                if (c.getName().equals(inputArgument)) {
                    done = true;
                    console.writef("%-37s", c.getName());
                    console.writeLine(c.getDescription());
                    break;
                }
            }
            if (done) {
                return true;
            } else {
                console.writeLine("No entry for \"" + inputArgument + "\" was found in the manual.");
            }
            return true;
        }
        return true;
    }
}
