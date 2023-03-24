package commands;

import console.Console;
import utility.CommandHistory;

public class HistoryCommand extends Command {
    public HistoryCommand(Console console) {
        super("history", "prints out last " + CommandHistory.HISTORY_SIZE + " commands", console);
    }

    @Override
    public boolean execute() {
        for (Command command : console.getCommandHistory()) {
            console.writeLine(command.getName());
        }
        return true;
    }
}
