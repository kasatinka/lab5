package app;

import console.Console;
import utility.CollectionManager;

import java.util.Scanner;

public class App {
    private final Console console;
    private final CollectionManager collectionManager;

    public App(String fileName) {
        App app = this;
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
