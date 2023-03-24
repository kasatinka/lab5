package commands;

import console.Console;
import utility.CommandHistory;

public class HistoryCommand extends Command {
    public HistoryCommand(Console console) {
        super("history", "Prints out the last " + CommandHistory.HISTORY_SIZE + " executed commands", console);
    }

    @Override
    public boolean execute() {
        for (Command command : console.getCommandHistory()) {
            console.writeLine(command.getName());
        }
        return true;
    }
}
