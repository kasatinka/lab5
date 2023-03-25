package app;

import console.Console;
import utility.CollectionManager;

import java.util.Scanner;

public class App {
    private String fileName;
    private CollectionManager collectionManager;
    private Console console;

    public App(String fileName) {
        this.fileName = fileName;
        this.collectionManager = new CollectionManager(fileName);
        this.console = new Console(new Scanner(System.in), fileName);
    }

    public void run() {
        console.init();
    }


}
