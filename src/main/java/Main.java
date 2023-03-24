import console.Console;
import utility.CollectionManager;
import utility.CommandHistory;
import utility.CommandRunner;
import utility.FileManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        CollectionManager collectionManager = new CollectionManager(fileManager);
        Scanner scanner = new Scanner(System.in);
        CommandHistory commandHistory = new CommandHistory();
        CommandRunner commandRunner = new CommandRunner();
        Console console = new Console(collectionManager, fileManager, scanner, commandRunner, commandHistory);
        console.init();
    }
}