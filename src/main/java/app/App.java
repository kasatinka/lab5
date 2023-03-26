package app;

import console.Console;
import utility.CollectionManager;

import java.util.Scanner;

public class App {
    private Console console;
    private CollectionManager collectionManager;
    private final App app = this;

    public App(String fileName) {
        this.console = new Console(new Scanner(System.in), app);
        this.collectionManager = new CollectionManager(fileName);
    }

    public void run() {
        console.init();
    }

    public CollectionManager getCollectionManager(){
        return this.collectionManager;
    }

}
