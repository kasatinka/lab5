import console.Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = System.getenv("fileName");
        Console console = new Console(scanner, fileName);
        console.init();
    }
}