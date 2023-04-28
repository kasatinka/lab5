package commands;

import console.Console;

public class HelpCommand extends Command {
    public HelpCommand(Console console) {
        super("help", "Displays this message", console);
    }

    @Override
    public boolean execute() {
        String inputArgument = console.getInputArgument();

        // Display all available commands and their descriptions
        if (inputArgument.isEmpty()) {
            for (Command command : console.getCommandList()) {
                console.writef("%-37s", command.getName());
                console.writeLine(command.getDescription());
            }
        }

        // Display the description of a specific command
        else {
            boolean found = false;
            for (Command command : console.getCommandList()) {
                if (command.getName().equals(inputArgument)) {
                    found = true;
                    console.writef("%-37s", command.getName());
                    console.writeLine(command.getDescription());
                    break;
                }
            }
            if (!found) {
                console.writeLine("No entry for \"" + inputArgument + "\" was found in the manual.");
            }
        }
        return true;
    }
}