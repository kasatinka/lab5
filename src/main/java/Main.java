import console.Console;
import utility.CollectionManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = System.getenv("fileName");
        CollectionManager collectionManager = new CollectionManager(fileName);
        Console console = new Console(scanner, fileName);
        console.init();
    }
}