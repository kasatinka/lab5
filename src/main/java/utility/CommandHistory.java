package utility;

import commands.Command;

import java.util.LinkedList;

public class CommandHistory {
    public static final int HISTORY_SIZE = 10;
    private final LinkedList<Command> history = new LinkedList<>();

    public void push(Command command) {
        if (history.size() > (HISTORY_SIZE - 1)) {
            history.removeFirst();
        }
        history.add(command);
    }

    public LinkedList<Command> getHistory() {
        return history;
    }
}
