package app;

import console.Console;
import utility.CollectionManager;

import java.util.Scanner;

public class App {
    private String fileName;
    private Console console;

    public App(String fileName) {
        this.fileName = fileName;
        this.console = new Console(new Scanner(System.in), fileName);
    }

    public void run() {
        console.init();
    }


}
