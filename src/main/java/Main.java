import console.Console;
import utility.CollectionManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = System.getenv("fileName");
        CollectionManager collectionManager = new CollectionManager(fileName);
        Console console = new Console(new Scanner(System.in), fileName);
        console.init();
    }
}