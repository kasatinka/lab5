package commands;

import console.Console;
import utility.CommandHistory;

import java.util.LinkedList;

public class HistoryCommand extends Command {
    public HistoryCommand(Console console) {
        super("history", "Prints out the last " + CommandHistory.HISTORY_SIZE + " executed commands", console);
    }

    @Override
    public boolean execute() {
        LinkedList<Command> commandHistory = console.getCommandHistory();
        for (Command command : commandHistory) {
            console.writeLine(commandHistory.indexOf(command) + " " + command.getName());
        }
        return true;
    }
}
