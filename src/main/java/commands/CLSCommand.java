package commands;

import console.Console;

public class CLSCommand extends Command {
    public CLSCommand(Console console) {
        super("cls", "analog of \"clear\" in UNIX and \"cls\" in DOS", console);
    }

    public boolean execute() {
        console.writeLine("\033[H\033[2J");
        console.flush();
        return true;
    }
}
