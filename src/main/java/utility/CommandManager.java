package utility;

import commands.Command;
import commands.ExitCommand;
import commands.HelpCommand;
import commands.HistoryCommand;
import console.Console;

import java.util.ArrayList;
import java.util.List;

public class CommandManager {
    private final List<Command> commandList = new ArrayList<>();
    private final Console console;

    public CommandManager(Console console) {
        this.console = console;

        commandList.add(new HelpCommand(console));
        commandList.add(new ExitCommand(console));
        commandList.add(new HistoryCommand(console));
        //commandList.add(.....);
    }

    public Command pullCommandByName(String s) {
        for (Command command : commandList) {
            if (command.getName().equals(s)) {
                return command;
            }
        }
        return null;
    }

    public List<Command> getCommandList() {
        return commandList;
    }
}
