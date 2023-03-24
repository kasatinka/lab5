package commands;

import console.Console;

public abstract class Command {
    private final String name;
    private final String description;
    public Console console;

    public Command(String name, String description, Console console) {
        this.name = name;
        this.description = description;
        this.console = console;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public abstract boolean execute();
}
