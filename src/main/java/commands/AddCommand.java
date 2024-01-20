package commands;

import console.Console;
import data.Coordinates;
import utility.MarineManager;

public class AddCommand extends Command {
    public AddCommand(Console console) {
        super("add", "Brings up a dialog to add a new SpaceMarine to the collection", console);
    }

    @Override
    public boolean execute() {
        MarineManager marineManager = console.getApp().getCollectionManager().getMarineManager();

        console.writeLine("Adding new marine...");
        do {
            console.writeLine("Enter a name..");
            String name = console.read();
            if (marineManager.validateName(name)) break;
        } while (true);

        console.writeLine("");

        do {
            console.writeLine("Enter the coordinates (X, Y) ...");
            String input = console.read();
            String _x = input.split(" ")[0];
            String _y = input.split(" ")[1];
            if (marineManager.validateX(_x) && marineManager.validateY(_y)) {

                double x = Double.parseDouble(_x);
                Float y = Float.parseFloat(_y);
                Coordinates coordinates = new Coordinates(x, y);

                break;
            }
        } while (true);

        console.writeLine("");


        return true;
    }
}
