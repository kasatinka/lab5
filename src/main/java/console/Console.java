package console;

import commands.Command;
import utility.CollectionManager;
import utility.CommandHistory;
import utility.CommandManager;
import utility.CommandRunner;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Console {
    public static final char LINE_MARKER = '>';
    private Scanner scanner;
    private final CommandRunner commandRunner = new CommandRunner();
    private final CommandHistory commandHistory = new CommandHistory();
    private final Console console = this;
    private final CommandManager commandManager = new CommandManager(console);
    private final CollectionManager collectionManager;


    public Console(Scanner scanner, String fileName) {
        this.scanner = scanner;
        this.collectionManager = new CollectionManager(fileName);
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

    public CollectionManager getCollectionManager() {
        return this.collectionManager;
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
