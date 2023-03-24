package commands;

import console.Console;

public class RemoveAllByHeartCountCommand extends Command {
    public RemoveAllByHeartCountCommand(Console console) {
        super("remove_all_by_heart_count", "Removes all the elements with matching heartCount from the collection", console);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
