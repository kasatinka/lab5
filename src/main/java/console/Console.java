package console;

import commands.Command;
import utility.CommandHistory;
import utility.CommandManager;
import utility.CommandRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Console {
    public static final char LINE_MARKER = '>';
    private final Scanner scanner;
    private final CommandRunner commandRunner;
    private final CommandHistory commandHistory;
    private final Console console = this;
    private final CommandManager commandManager = new CommandManager(console);


    public Console(Scanner scanner, CommandRunner commandRunner, CommandHistory commandHistory) {
        this.scanner = scanner;
        this.commandRunner = commandRunner;
        this.commandHistory = commandHistory;
    }

    public void init() {
        String[] input;
        do {
            console.write(LINE_MARKER);
            input = (scanner.nextLine().trim() + " ").split(" ", 2);
            input[1] = input[1].trim();
            launchCommand(input);
        } while (true);
    }

    public void write(Object printable) {
        System.out.print(printable);
    }

    public void writeLine(Object printable) {
        System.out.println(printable);
    }

    public void writef(String mask, Object printable) {
        System.out.printf(mask, printable);
    }

    public void printError(Object printable) {
        System.out.println("error: " + printable);
    }

    public void flush() {
        System.out.flush();
    }

    public LinkedList<Command> getCommandHistory() {
        return commandHistory.getHistory();
    }

    public List<Command> getCommandList() {
        return commandManager.getCommandList();
    }

    private void launchCommand(String[] userCommand) {
        Command command = commandManager.pullCommandByName(userCommand[0]);
        if (!userCommand[0].equals("")) {
            if (command != null) {
                commandRunner.executeCommand(command, userCommand[1]);
                commandHistory.push(command);
            } else {
                writeLine("Name \"" + userCommand[0] + "\" could not be resolved. Try typing \"help\" for reference.");
            }
        }
    }

    public void close() {
        System.exit(0);
    }
}
