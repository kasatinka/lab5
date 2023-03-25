import console.Console;
import utility.MarineManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = System.getenv("fileName");
        MarineManager marineManager = new MarineManager();
        Console console = new Console(scanner, fileName);
        console.init();
    }
}