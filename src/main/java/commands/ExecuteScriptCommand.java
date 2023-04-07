package commands;

import console.Console;

public class ExecuteScriptCommand extends Command {
    public ExecuteScriptCommand(Console console) {
        super("execute_script", "Executes a script", console);
    }

    public boolean execute(String argument) {
        return false;
    }

    public boolean execute() {
        console.writeLine("Usage: execute_script <file_name>");
        return false;
    }
}
