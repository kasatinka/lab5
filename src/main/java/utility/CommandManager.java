package utility;

import commands.*;
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
        commandList.add(new ExecuteScriptCommand(console));
        commandList.add(new AddCommand(console));
        commandList.add(new ClearCommand(console));
        commandList.add(new InfoCommand(console));
        commandList.add(new MaxByCategoryCommand(console));
        commandList.add(new PrintAscendingCommand(console));
        commandList.add(new RemoveAllByHeartCountCommand(console));
        commandList.add(new RemoveByIDCommand(console));
        commandList.add(new RemoveHeadCommand(console));
        commandList.add(new SaveCommand(console));
        commandList.add(new UpdateCommand(console));
        //commandList.add(new ..Command(console));
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
