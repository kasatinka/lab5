package console;

import commands.Command;
import utility.CommandHistory;
import utility.CommandManager;
import utility.CommandRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*Basic functionality is done.*/

public class Console {
    public static final char LINE_MARKER = '>';
    private final Scanner scanner;
    private final CommandRunner commandRunner = new CommandRunner();
    private final CommandHistory commandHistory = new CommandHistory();
    private final Console console = this;
    private final CommandManager commandManager = new CommandManager(console);
    private String inputArgument = "";


    public Console(Scanner scanner, String fileName) {
        this.scanner = scanner;
    }

    public void init() {
        String[] input;
        do {
            console.write(LINE_MARKER);
            input = (console.read().trim() + " ").split(" ", 3);
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

    public String read() {
        return scanner.nextLine();
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

    public String getInputArgument() {
        return this.inputArgument;
    }


    private void launchCommand(String[] userCommand) {
        Command command = commandManager.pullCommandByName(userCommand[0]);
        if (!userCommand[0].equals("")) {
            if (command != null) {
                inputArgument = userCommand[1];
                if (commandRunner.executeCommand(command)) {
                    commandHistory.push(command);
                }
            } else {
                writeLine("Name \"" + userCommand[0] + "\" could not be resolved. Try typing \"help\" for reference.");
            }
            inputArgument = "";
        }
    }

    public void close() {
        System.exit(0);
    }
}
